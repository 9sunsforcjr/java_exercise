/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teris.cx;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author Mactavish
 */
public class Controller extends Thread {

    GamePanel gp;
    BlockPanel bp;
    ScorePanel sp;
    int rand;               //随机数 block的下标
    boolean pause = false;  //暂停标志
    boolean restart = false;    //重新启动标志
    boolean shutThread = false; //控制关闭线程
    Thread temp;                //游戏运行（控制下落）线程
    int[] speed = {900, 800, 700, 600, 500, 400, 300, 200, 100};    //下落速度

    Controller(GamePanel gp, BlockPanel bp, ScorePanel sp) {
        this.gp = gp;
        this.bp = bp;
        this.sp = sp;

    }

    public void resetParameters() {     //重启游戏时用到，重置所有panel的图&相应参数的值
        sp.removeAll();
        gp.removeAll();
        bp.removeAll();
        gp.isGameover = false;
        gp.blockIndex = 0;
        gp.x = 40;
        gp.y = -20;
        gp.fix = new int[22][10];
        sp.score = 0;
        sp.gameSpeed = 0;
        for (int i = 0; i < 12; i++) {
            bp.block[i] = 0;
        }
        sp.repaint();       //让panel恢复到初始状态
        bp.repaint();

    }

    public void runRepeatableThread() {     //考虑到重新开始游戏的功能，一个线程不够用，使用
        Runnable DownloadRunnable = new Runnable() {
            @Override
            public void run() {
                while (!downIsOverstep(gp.x, gp.y + 20, gp.block1) && !shutThread) {
                    try {
                        while (pause) {     //点击暂停时
                            suspend();
                        }
                        gp.y += 20;
                        gp.repaint();
                        setSpeed();
                        Thread.sleep(speed[sp.gameSpeed]);
                        if (downIsOverstep(gp.x, gp.y + 20, gp.block1)) {   //判断运动的方块到底，添加到fix里
                            addFix(gp.x, gp.y, gp.block1);
                            clearLine(gp.fix);              //判断是否需要清行
                            gp.x = 40;
                            gp.y = -20;
                            getNewBlocks();             //生成新的方块
                        }
                        if (gp.fix[17][0] == 1 || gp.fix[17][1] == 1 || gp.fix[17][2] == 1 || gp.fix[17][3] == 1 || gp.fix[17][4] == 1 || gp.fix[17][5] == 1 || gp.fix[17][6] == 1 || gp.fix[17][7] == 1 || gp.fix[17][8] == 1 || gp.fix[17][9] == 1) {
                            gp.removeAll();             //判断fix是否到顶，到顶则清空panel，游戏结束
                            gp.isGameover = true;
                            gp.repaint();
                            break;
                        }
                    } catch (InterruptedException e) {
                        break;
                    }
                }
            }
        };

        temp = new Thread(DownloadRunnable);
        temp.start();

    }

    public void addFix(int x, int y, int[] block) {         //添加下落物块到fix中
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (block[i * 4 + j] == 1) {
                    gp.fix[19 - ((y + 20 * i) / 20)][(x + 20 * j) / 20] = 1;
                }
            }
        }
    }

    public void setSpeed() {            //在达到相应分数or等级时重设游戏速度

        if (sp.score == 10) {
            sp.gameSpeed = 1;
        } else if (sp.score == 20) {
            sp.gameSpeed = 4;
        } else if (sp.score >= 30) {
            sp.gameSpeed = 6;
        }
    }

    public void clearLine(int[][] fix) {    //清除一整行灰色块
        for (int i = 0; i < 20; i++) {
            if (fix[i][0] == 1 && fix[i][1] == 1 && fix[i][2] == 1 && fix[i][3] == 1 && fix[i][4] == 1 && fix[i][5] == 1 && fix[i][6] == 1 && fix[i][7] == 1 && fix[i][8] == 1 && fix[i][9] == 1) {
                for (int j = i; j < 19; j++) {
                    System.arraycopy(fix[j + 1], 0, fix[j], 0, 10);
                }
                ++sp.score;
                sp.repaint();
                --i;
            }
        }

    }

    public boolean isOverstep(int x, int y, int[] block) {  //判断是否允许翻转下落
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (block[i * 4 + j] == 1 && ((x + j * 20 < 0) || (x + j * 20 > 180) || (gp.fix[19 - (y + 20 * i) / 20][(x + 20 * j) / 20] == 1))) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean downIsOverstep(int x, int y, int[] block) {      //判断是否允许下落
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (block[i * 4 + j] == 1 && ((y + i * 20 > 380) || (gp.fix[19 - (y + 20 * i) / 20][(x + 20 * j) / 20] == 1))) {
                    return true;
                }
            }
        }
        return false;
    }

    public void left() {
        gp.x -= 20;
        gp.repaint();
    }

    public void right() {
        gp.x += 20;
        gp.repaint();
    }

    public void down() {
        gp.y += 20;
        gp.repaint();
    }

    public void turn() {
        Blocks block = new Blocks();
        int temp = gp.blockIndex;
        if (temp < block.graph[rand].length - 1) {
            ++temp;
        } else {
            temp = 0;
        }
        if (!isOverstep(gp.x, gp.y, block.graph[rand][temp])) {
            gp.blockIndex = temp;
            gp.block1 = block.graph[rand][gp.blockIndex];
            gp.repaint();
        }

    }

    public void getNewBlocks() {        //把bp里的block传给gp，bp产生新的
        rand = bp.rand;
        gp.block1 = bp.block;
        Blocks block = new Blocks();
        Random random = new Random();
        bp.rand = random.nextInt(7);
        bp.block = block.graph[bp.rand][0];
        bp.repaint();
        resetColor();

    }

    public void resetColor() {          //让下落的物块颜色随机
        Random random = new Random();
        int rand2 = random.nextInt(5);
        switch (rand2) {
            case 0:
                gp.c = Color.blue;
                break;
            case 1:
                gp.c = Color.red;
                break;
            case 2:
                gp.c = Color.yellow;
                break;
            case 3:
                gp.c = Color.green;
                break;
            case 4:
                gp.c = Color.MAGENTA;
                break;
        }
    }

}

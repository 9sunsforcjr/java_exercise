package guessnumbergame.cx;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Mactavish
 */
public class GuessNumberGame {
    public static int round;
    public static void Game(User user, Computer computer){
        System.out.println("游戏开始");
        round=0;
        int flag;
        int tempScore[]=new int[2];
        while(user.getScore()>0&&computer.getScore()>0){
            System.out.println("/////////////////////");
            System.out.println("现在进行第"+(++round)+"轮游戏");
            user.setNumber();
            computer.setNumber();   
            flag=Judge.judge(user.getNumber(), computer.getNumber());
            tempScore=Judge.editScore(flag, user.getScore(), computer.getScore());
            user.setScore(tempScore[0]);
            computer.setScore(tempScore[1]);
            if(flag<4){
                System.out.println("第"+round+"轮游戏"+user.getName()+"赢了");
            }
            else{
                System.out.println("第"+round+"轮游戏电脑赢了");
            }
            System.out.println(user.getName()+"的分数："+tempScore[0]);
            System.out.println("电脑的分数："+tempScore[1]);
        }
        System.out.println("游戏结束");
        if(user.getScore()>0){
            System.out.println("经过"+round+"轮游戏，"+user.getName()+"赢了，分数："+user.getScore());
        }
        else{
            System.out.println("经过"+round+"轮游戏，电脑赢了，分数："+computer.getScore());
        }
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        User user=new User();
        Computer computer=new Computer();
        user.setName();
        GuessNumberGame.Game(user, computer);
        
    }
    
}

package guessnumbergame.cx;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Mactavish
 */
public class User {
    public String name;
    public int score;
    public int number;
    User(){
        score=100;
    }

  public  void setScore(int score){
        this.score=score;
    }
   public void setName(){
       System.out.println("请输入你的名字");
       Scanner in=new Scanner(System.in,"GBK");
        this.name=in.next();
    }

   public void setNumber(){
       System.out.println("请输入你猜的数");
       Scanner in=new Scanner(System.in);
       number=in.nextInt();
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }


}


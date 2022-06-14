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
public class Computer {
    public String name;
    public int score;
    public int number;
    Computer(){
        score=100;
        name="电脑";
    }
    void setNumber(){
        Random rd=new Random();
        
        number=(int)(Math.random()*100);
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

    /**
     * @param score the score to set
     */
    public void setScore(int score) {
        this.score = score;
    }
}



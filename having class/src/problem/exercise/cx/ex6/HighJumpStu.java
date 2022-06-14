/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.exercise.cx.ex6;

import problem.exercise.cx.ex2.*;

/**
 *
 * @author Mactavish
 */
public class HighJumpStu extends Student{
    private float jumpHeight;
            HighJumpStu(){
        System.out.println("HighJumpStu created");
    }
    HighJumpStu(String name,char sex,int year,int month,int day){
        this.name=name;
        this.sex=sex;
        this.birthY=year;
        this.birthM=month;
        this.birthD=day;
    }
    
    boolean jump(float height){
        float delta;
        delta=jumpHeight-height;
        return delta >= 1e-4;
    }

    /**
     * @param jumpHeight the jumpHeight to set
     */
    public void setJumpHeight(float jumpHeight) {
        this.jumpHeight = jumpHeight;
    }
    

}

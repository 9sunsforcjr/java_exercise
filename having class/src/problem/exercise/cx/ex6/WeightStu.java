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
public class WeightStu extends Student{
    private float power;
    WeightStu(){
        System.out.println("WeightStu created");
    }
    WeightStu(String name,char sex,int year,int month,int day){
        this.name=name;
        this.sex=sex;
        this.birthY=year;
        this.birthM=month;
        this.birthD=day;
    }    
    boolean lifting(float mass){
        float delta;
        delta=power-mass;
        return delta >= 1e-4;
    }
        void address1(){
            System.out.println("子类重写函数");

    }
    /**
     * @param power the power to set
     */
    public void setPower(float power) {
        this.power = power;
    }

}

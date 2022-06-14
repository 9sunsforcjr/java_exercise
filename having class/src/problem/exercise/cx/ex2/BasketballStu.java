/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.exercise.cx.ex2;

/**
 *
 * @author Mactavish
 */
public class BasketballStu extends Student {
    private float accuracy;
    BasketballStu(String name,char sex,int year,int month,int day){
        this.name=name;
        this.sex=sex;
        this.birthY=year;
        this.birthM=month;
        this.birthD=day;
    }    
    int shot(int n){
        int goal;
        goal = (int)(n*accuracy);
        return goal;
    }

    /**
     * @param accuracy the accuracy to set
     */
    public void setAccuracy(float accuracy) {
        this.accuracy = accuracy;
    }

}

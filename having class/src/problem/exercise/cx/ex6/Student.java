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


public class Student {
    String name;
    char sex;
    int birthY;
    int birthM;
    int birthD;
    private float speed;
    float run(float range){
        float time=range/speed;
        return time;
    }
        void address(){
            System.out.println("123");

    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(float speed) {
        this.speed = speed;
    }
}

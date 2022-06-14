/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.exercise.cx.cx3;

/**
 *
 * @author Mactavish
 */
public class Application {
    public static void main(String args[]){
        Car c=new Car();
        Timer timer=new Timer();
        double t=timer.getTime(c, 300);
        System.out.println(t);
    }
}

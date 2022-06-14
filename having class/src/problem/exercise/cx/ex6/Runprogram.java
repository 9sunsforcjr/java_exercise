/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.exercise.cx.ex6;


import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mactavish
 */



public class Runprogram {
    public static void main(String [] args){
        	    Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
         //适用于有继承的情况，生成的s是一个上转型对象，只能访问隐藏的变量，继承的变量，继承或重写的方法
        Class cs = null;
        try {
            cs = Class.forName("problem.exercise.cx.ex6."+name);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Runprogram.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            Student s=(Student)cs.newInstance();
                    s.address();
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Runprogram.class.getName()).log(Level.SEVERE, null, ex);
        }




    
    }

}

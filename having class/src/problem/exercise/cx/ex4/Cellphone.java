/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.exercise.cx.ex4;

/**
 *
 * @author Mactavish
 */
public class Cellphone implements Storable{

    String deviceName;
    Cellphone(String str){
        deviceName=str;
    }
    /**
     *
     */
    @Override
    public void store(){
        System.out.println("该内容来自"+deviceName);
    }
}

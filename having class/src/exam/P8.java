/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mactavish 设计一个线程类A，其中有一个int[]类型的成员变量arr,和一个int类型的成员变量key。
 * 设置一个构造方法能够初始化成员变量arr和key。要求该线程能够将数组arr里面的数据
 * 依次与key相乘，并实现在每0.1秒时间间隔倒序输出（分号；作为间隔符）。
 */
public class P8 extends Thread{

    int[] arr;
    int key;
    P8(int arr[],int key){
        this.arr=arr;
        this.key=key;
    }
    public void run(){
        for(int i=0;i<arr.length-1;i++){
            System.out.print(key*arr[i]);
            System.out.print(';');
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(P8.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }

        System.out.print(key*arr[arr.length-1]);
    }
   




    public static void main(String argz[]) {
        int[] arr = {4, 5, 6};
        int key = 3;
        P8 a = new P8(arr, key);
        a.start();
    }
}

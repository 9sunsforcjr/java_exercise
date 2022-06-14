/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mactavish 设计两个线程类A和B， 其中A中有属性String value和方法void setValue(String
 * value)，实现对成员变量value的 赋值； B中有属性int[] arr和setArr(int[] arr)实现对成员变量arr的赋值。
 * 如下图测试例所示，要求能够在启动A和B的线程后，实现a中value字符串、b中arr数 组中的字符交替输出，输出间隔100毫秒。
 * 提示：输出使用System.out.print()方法
 */
public class P9 {

    public static void main(String argz[]) {
        A a = new A();
        a.setValue("hello world");
        B b = new B();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        b.setArr(arr);
        a.start();
        try {
            Thread.sleep(50);
        } catch (Exception e) {
        }
        b.start();
    }
}

class A extends Thread {

    String value;
    

    void setValue(String value) {
        this.value = value;
    }

    public void run() {
        int length = value.length();
        char c[] = value.toCharArray();
        for (int i = 0; i < length; i++) {
            System.out.print(c[i]);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

class B extends Thread {

    int[] arr;

    void setArr(int[] arr) {
        this.arr = arr;
    }

    public void run() {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Mactavish 新建一个名为MyMath的类，在该类中定义一个名为int sum(String s)的方法，方法实现
 * 以下功能：输入为一串数字的字符串，以空格分隔，例如 3 5 17 20，计算这些数字的 和，并返回计算结果。
 */
public class P34 {

    /*public class MyMath {
    int sum(String s) {
        StringTokenizer f = new StringTokenizer(s);
        int sum = 0;
        while (f.hasMoreTokens()) {
            sum = sum + Integer.parseInt(f.nextToken());
        }
        return sum;
    }
     }*/
    int sum(String s) {
        int sum = 0;
        Scanner scanner = new Scanner(s);
        while (scanner.hasNext()) {
            sum = sum + scanner.nextInt();
        }
        return sum;
    }


    public static void main(String argz[]) {
        P34 p = new P34();
        String s = "3 4 15";
        System.out.println(p.sum(s));

    }
}

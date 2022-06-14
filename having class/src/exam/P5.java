/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.StringTokenizer;

/**
 *
 * @author Mactavish 
 * 创建类名MyUtil的类， 设计一个方法int stat(String obj,String key)，统计出obj字符串中
key出现的个数
 */
public class P5 {

    //public class MyMath {
    int stat(String obj,String key){
        String str[]=obj.split(key);
        int a=str.length;
        return a-1;
    }

    // }
    public static void main(String argz[]) {
        P5  mu=new P5 ();
System.out.println(mu.stat("Hello World","o"));
    }
}

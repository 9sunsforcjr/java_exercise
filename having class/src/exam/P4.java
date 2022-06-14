/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.StringTokenizer;

/**
 *
 * @author Mactavish 创建类名StringUtil的类， 设计一个方法String finding(String obj,String
 * key,int len)，可 以将字符串obj中第一个出现的key后的len个字符输出来 例如 obj为“4月6日，校长郝芳访问了山东大学”
 * key是校长，len为2 返回值为郝芳
 */
public class P4 {

    //public class MyMath {
    String finding(String obj, String key, int len) {
        String find;
        int m = key.length();
        int n = obj.indexOf(key);
        find = obj.substring(m + n, m + n + len);
        return find;
    }

    // }
    public static void main(String argz[]) {
        P4 su = new P4();
        String obj = "校长郝芳访问了山东大学";
        String key = "校长";
        int len = 3;
        System.out.println(su.finding(obj, key, len));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author Mactavish 创建一个类A ，设计一个方法 void save(String s, int n)，将字符串s分割，每n个字符一
 * 组存放在集合中，设计一个方法String getData(int index)返回集合中index位置的字符串
 */
public class P12 {

    LinkedList<String> list;

    P12() {
        list = new LinkedList<String>();
    }

    void save(String s, int n) {
        String str = null;
        int i;
        for (i = 0; i < s.length(); i = i + n) {
            if (i >= s.length() - n) {
                break;
            }
            str = s.substring(i, i + n);
            list.add(str);
        }
        str = s.substring(i, s.length());
        list.add(str);
    }

    String getData(int index) {
        return list.get(index);
    }

    public static void main(String argz[]) {
        P12 a = new P12();
        a.save("helloworld", 2);
        System.out.println(a.getData(2));
        
    }
}

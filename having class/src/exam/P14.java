/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/**
 *
 * @author Mactavish
 */
public class P14 implements Comparable {

    char c;
    int n;

    P14(char a, int b) {
        c = a;
        n = b;
    }

    P14() {
    }

    public int compareTo(Object b) {
        P14 c = (P14) b;
        if (this.n == c.n) {
            return 0;
        }
        if (this.n > c.n) {
            return 1;
        }
        return -1;
    }

    public String stat(String s) {
        char[] c = s.toCharArray();
        List<P14> list = new ArrayList<P14>();
        int count;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '0') {
                continue;
            }
            count = 1;
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] == c[j]) {
                    ++count;
                    c[j] = '0';
                }
            }
            list.add(new P14(c[i], count));
            c[i] = '0';
        }
        Collections.sort(list);
        Collections.reverse(list);
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            str = str + String.valueOf(list.get(i).c) + String.valueOf(list.get(i).n);
        }
        return str;
    }

    public static void main(String argz[]) {
        /*    HashMap<String, String> maptest = new HashMap<String, String>();
        maptest.put("1天", "day1");
        maptest.put("5天", "day5");
        maptest.put("4天", "day4");
        maptest.put("2天", "day2");
        maptest.put("3天", "day3");

        Collection<String> keyset = maptest.keySet();
        List<String> list = new ArrayList<String>(keyset);

        //对key键值按字典升序排序
        Collections.sort(list);

        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println("key键---值: " + list.get(i) + "," + maptest.get(list.get(i)));
        }
         */
        P14 a = new P14();
        System.out.println(a.stat("abcaabcbb"));
    }

}

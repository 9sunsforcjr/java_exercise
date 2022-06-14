/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.HashMap;

/**
 *
 * @author Mactavish 创建一个类MyDictionary,一个方法void addNewWords(String en,String
 * cn)将英汉对照 加入到一个集合中，一个方法String trans(String en)返回英文的中文解释，若在集合中 着不到，返回“null”
 */
public class P10 {

    HashMap<String, String> mp;

    P10() {
        mp = new HashMap<String, String>();
    }

    void addNewWords(String en, String cn) {
        mp.put(en, cn);
    }

    String trans(String en) {
        if (mp.containsKey(en)) {
            return mp.get(en);
        } else {
            return null;
        }
    }

    public static void main(String argz[]) {
        P10 md = new P10();
        md.addNewWords("swim", "youyong");
        String s = md.trans("swim");
        System.out.println(s);
    }
}

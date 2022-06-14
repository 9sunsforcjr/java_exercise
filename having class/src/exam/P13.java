/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.Calendar;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Locale;

/**
 *
 * @author Mactavish 创建一个名为People的类，该类有一个字符串类型的birthday属性，一个void
 * setBirthday(String birthday)方法，实现对birthday的赋值，一个方法int getAge()方法，
 * 要求根据birthday返回年龄。
 */
public class P13 {

    String birthday;
    void setBirthday(String birthday){
        this.birthday=birthday;
    }
    int getAge(){
        int age;
        String []str=new String[3];
        str=birthday.split("-");
        Calendar c=Calendar.getInstance();
        double d1=c.getTimeInMillis();
        c.set(Integer.parseInt(str[0]),Integer.parseInt(str[1]),Integer.parseInt(str[2]));
        double d2=c.getTimeInMillis();
        double num=(d1-d2)/(1000*60*60*24)/365;

        age=(int)num-1;
        return age;
    }


    public static void main(String argz[]) {
        P13 p = new P13();

        p.setBirthday("2000-01-01");
        System.out.println(p.getAge());

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.Calendar;

/**
 *
 * @author Mactavish 现在设计一个Manager类作为People的子类，在Manager中定义一个方法int getBonus(int
 * x)，通过调用父类的getAge方法，获取年龄，返回奖金值为年龄的x倍。
 * 设计一个Employee类作为People的子类，在类Employee中定义一个方法int
 * getWorkday()，通过调用父类的getAge方法，获取年龄，返回工作日为当年天数，减去 115法定休息日，再减去职工年龄。
 */
public class P2 {

    public class People {

        public String name;
        public String birthday;

        public void setBirthday(String birthday) { //要求日期格式 1988-01-01
            this.birthday = birthday;
        }

        public int getAge() {
            String y = birthday.substring(0, 4);
            Calendar c = Calendar.getInstance();
            return c.get(Calendar.YEAR) - Integer.parseInt(y);
        }
    }

    public class Manager extends People {

        int getBonus(int x) {
            return x * super.getAge();
        }
    }

    public class Employee extends People {

        int getWorkday() {
            return 365 - 115 - super.getAge();
        }
    }

    public static void main(String argz[]) {


    }
}

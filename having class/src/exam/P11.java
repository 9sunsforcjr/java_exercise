/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.HashMap;

/**
 *
 * @author Mactavish 创建一个类StudentManage,一个方法void addNewStudent(int
 * studentID,String name) 将学生学号和姓名对照加入到一个集合中，一个方法String getName(String
 * studentID)，通过学号参数返回学生姓名（注：这里的参数类型是字符串类型，而不是 int类型），若在集合中找不到该学号，返回“null”
 */
public class P11 {

    HashMap<String, String> mp;

    P11() {
        mp = new HashMap<String, String>();
    }

    void addNewStudent(int studentID,String name){
        String id=String.valueOf(studentID);
        mp.put(id, name);
    }

    String getName(String studentID) {
        if(mp.containsKey(studentID)){
            return mp.get(studentID);
        }
        return null;
    }

    public static void main(String argz[]) {
        P11 sm = new P11();
        sm.addNewStudent(12345, "ljh");
        System.out.println(sm.getName("12345"));
    }
}

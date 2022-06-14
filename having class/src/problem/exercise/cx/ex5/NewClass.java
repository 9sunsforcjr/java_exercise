/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.exercise.cx.ex5;

import java.util.StringTokenizer;

/**
 *
 * @author Mactavish
 */
public class NewClass {
    public String getStudentID(String filename){
        String spilt[]=filename.split("[_.]");
        return spilt[1];
    }
    public static void main(String argz[]){
        NewClass nc=new NewClass();
        String filename="java_zhangsan.rar";
        System.out.println(nc.getStudentID(filename));
        StringTokenizer s=new StringTokenizer(filename,"_.");
        s.nextToken();
          System.out.println(s.nextToken());
        
    }
}

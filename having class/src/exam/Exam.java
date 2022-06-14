/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author Mactavish 
 * 设计一个类A，A中包含一个方法String[] retain(String[] arg1,String[] arg2)，要求返回两个字符串的交集。
 */
interface Checkable{    

       abstract int getCode(String s);

       abstract int getCode(int i);

}
class C implements Checkable{
    public int getCode(String s){
        int length=s.length();
        int num=0;
        char c;
        for(int i=0;i<length;i++){
            c=s.charAt(i);
            num=num+(int)c;
        }
        return num%100;
    }
   public int getCode(int i){
       int num=0;
       while(i!=0){
           if(i<10){
               num=num+i;
           }
           num=num+i%100;
           i=i/100;
           System.out.println(num);
           System.out.println(i);
       }
       return num%100;
   }
}
public class Exam {


    
   String[] retain(String[] arg1,String[] arg2){
       
       ArrayList<String> list1=new ArrayList<String> (Arrays.asList(arg2));
       ArrayList<String> list=new ArrayList<String> ();
       HashSet<String>hs=new HashSet<String>();
       hs.retainAll(hs)
       for(int i=arg1.length-1;i>-1;i--){
           if(list1.contains(arg1[i])){
               list.add(arg1[i]);
           }
       }
       Object [] objectArray=list.toArray();
       String[]str=Arrays.copyOf(objectArray,objectArray.length,String[].class);
       return str;
   }
    String[] retain(String[] arg1, String[] arg2) {
        String[] str = new String[arg1.length];
        int flag = 0;
        for (int i = arg1.length - 1; i > -1; i--) {
            for (int j = 0; j < arg2.length; j++) {
                if (arg2[j].equals(arg1[i])) {
                    str[flag++] = arg2[j];
                }
            }

        }
        String[] str2 = new String[flag];
        System.arraycopy(str, 0, str2, 0, flag);
        return str2;
    }


    
    
    
    
    public static void main(String argz[]) {
 C a = new C();
System.out.println(a.getCode("ABC"));
System.out.println(a.getCode(12345));
    }
}

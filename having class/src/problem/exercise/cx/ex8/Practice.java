/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.exercise.cx.ex8;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author Mactavish 04141 要求去重复，排序
 */
public class Practice {

    public void printName(String[] arr) {
        SortedSet ts = new TreeSet();    
        for(int i=0;i<arr.length;i++){
                ts.add(arr[i]);
            }
   
     Iterator i = ts.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
    public static void main(String argz[]) {
        Practice p=new Practice();
        String arr[]={ null};
        p.printName(arr);

       
    }
}

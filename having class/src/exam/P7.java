/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mactavish 
 * 创建一个名为MyFileReader的类，设计一个方法 String read(String fileName, int n),该
读取名为fileName的文件，返回文件中第n个字符(n从0开始)。
 */
public class P7 {

    //public class MyMath {
   String read(String fileName, int n){

       char c='0';
       try {
           Reader a=new FileReader(fileName);
           BufferedReader b=new BufferedReader(a);
           for(int i=0;i<n+1;i++){
               c=(char)b.read();
           }
       } catch (FileNotFoundException ex) {
           Logger.getLogger(P7.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(P7.class.getName()).log(Level.SEVERE, null, ex);
       }
       return String.valueOf(c);
       
   }

    // }
    public static void main(String argz[]) {
       P7 mfr=new P7();
System.out.println(mfr.read("C:\\Users\\Mactavish\\Desktop\\SQL sentences practice.txt",2));
    }
}

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
读取名为fileName的文件，返回文件中第n行的内容
 */
public class P6 {

    //public class MyMath {
   String read(String fileName, int n){
       String str=null;
       int i=0;
       try {
           Reader a=new FileReader(fileName);
           BufferedReader b=new BufferedReader(a);
           while((str=b.readLine())!=null){
               i++;
               if(i==n){
                   break;
               }
           }
       } catch (FileNotFoundException ex) {
           Logger.getLogger(P6.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(P6.class.getName()).log(Level.SEVERE, null, ex);
       }
       return str;
       
   }

    // }
    public static void main(String argz[]) {
       P6 mfr=new P6();
System.out.println(mfr.read("C:\\Users\\Mactavish\\Desktop\\SQL sentences practice.txt",2));
    }
}

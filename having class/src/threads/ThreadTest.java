/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author Mactavish
 */
public class ThreadTest extends Thread {
    public void run(){
        int i=0;
        while(i<10){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){}
            ++i;
        }
    }
    public static void main(String argz[]){
        ThreadTest tt=new ThreadTest();
        tt.start();
    }
}

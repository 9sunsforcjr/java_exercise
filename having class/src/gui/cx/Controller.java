/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.cx;

/**
 *
 * @author Mactavish
 */
public class Controller extends Thread{
    public javax.swing.JProgressBar ProgressBar;
    public DrawPanel panel;
    Controller(javax.swing.JProgressBar a){
        ProgressBar=a;
    }
    Controller(DrawPanel a){
        panel=a;
    }
    /*public void run(){
        int i=0;
        while(i<100){
            ProgressBar.setValue(i);
            try{
                Thread.sleep(300);
            }
            catch(InterruptedException e){}
            ++i;
        }
*/
    public void run(){
        while(panel.y>0){
             try{
                panel.x=panel.x+10;
                panel.y=panel.y-10;
                panel.repaint();
                 Thread.sleep(300);
                 if(panel.y<=0){
                     panel.x=50;
                     panel.y=200;
                 }
            }
            catch(InterruptedException e){}
        }
        int i=0;
        while(i<100){
            ProgressBar.setValue(i);
           
            ++i;
        }
    }
    }


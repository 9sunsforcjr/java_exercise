/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.exercise.cx.ex4;

/**
 *
 * @author Mactavish
 */
public class Run {
    public static void main(String argz[]){
        PrintShop ps=new PrintShop();
        Storable s;
        Cellphone cellphone=new Cellphone("小博的手机");
        s=cellphone;
        ps.print(s);
        Ipad ipad=new Ipad("kunkun的Ipad");
        s=ipad;
        ps.print(s);
        UDisk udisk=new UDisk("九日的u盘");
        s=udisk;
        ps.print(s);
    }
}

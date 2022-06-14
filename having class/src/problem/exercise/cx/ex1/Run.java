package problem.exercise.cx.ex1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mactavish
 */
public class Run {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student a[] =new Student[11];
        a[0]=new Student("梨花",'F',1998,2,4);
        a[1]=new Student("鸭梨",'F',1999,4,6);
        a[2]=new Student("苹果",'F',1998,1,17);
        a[3]=new Student("小明",'M',1998,3,24);
        a[4]=new Student("小华",'M',1998,2,9);
        a[5]=new Student("大牛",'M',1998,5,20);
        a[6]=new Student("小白",'F',1998,6,8);
        a[7]=new Student("九日",'M',1998,2,4);
        a[8]=new Student("小博",'M',1998,9,7);
        a[9]=new Student("航航",'M',1998,12,24);
        a[10]=new Student("阿锦",'M',1999,10,2);
        Teacher tea=new Teacher();
        Teacher.getSexRatio(a);
        Teacher.getBirthMonthStatics(a);
        Teacher.findStudent(a, "小");
    }
    
}

package problem.exercise.cx.ex1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author Mactavish
 */
public class Student {
    String name;
    char sex;
    int birth_y;
    int birth_m;
    int birth_d;
    Student(String nome, char sesso, int nascita_y,int nascita_m,int nascita_d){
       
        name=nome;
        sex=sesso;
        birth_y=nascita_y;
        birth_m=nascita_m;
        birth_d=nascita_d;
        System.out.println("stu"+this.name+"created succesfully");
    }
    Student(){
        Scanner in = new Scanner(System.in);
        String t;
        System.out.println("please input stu name");
        name=in.nextLine();
        System.out.println("please input stu sex");
        t=in.nextLine();
        sex=t.charAt(0);
        System.out.println("please input stu birthdate with the format:"+"year month day");
        birth_y=in.nextInt();
        birth_m=in.nextInt();
        birth_d=in.nextInt();
        System.out.println("stu"+this.name+"created succesfully");
    }
    
}

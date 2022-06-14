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
public class Teacher {
   static  void getSexRatio(Student stu[]){
        int length=stu.length;
        float sum=length;
        int nboy=0,ngirl=0;
        for(int i=0;i<length;i++){
            if(stu[i].sex=='M'){
                ++nboy;
            }
            else{
                ++ngirl;
            }
        }
        System.out.println("男女比例："+String.format("%.2f",100*nboy/sum)+"%  "+String.format("%.2f",100*ngirl/sum)+"%");
    }
    static void findStudent(Student stu[],String key){
        System.out.println("查找如下");
        int length=stu.length;
        for(int i=0;i<length;i++){
            if(!stu[i].name.contains(key)){
                ;
            }
            else{
                System.out.println(stu[i].name);
            }
        }
        System.out.println("查找结束");
    }
    static void getBirthMonthStatics(Student stu[]){
        int length=stu.length;
        int month[]=new int [12];
        String name[][]=new String[12][10];
        for(int i=0;i<length;i++){
            name[stu[i].birth_m-1][month[stu[i].birth_m-1]]=stu[i].name;
            ++month[stu[i].birth_m-1];
        }
        for(int i=0;i<12;i++){
            if(month[i]==0){
                continue;
            }
            System.out.print((i+1)+"月 "+month[i]+"人  ");
            if(month[i]>0){
                for (String item : name[i]) {
                    if (item == null) {
                        break;
                    }
                    System.out.print(item + ",");
                }
                System.out.println();
            }
            
        }
        /*
                for(int j=0;j<name[i].length;j++){
                    if(name[i][j]==null){
                        break;
                    }
                    System.out.print(name[i][j]+",");
                }
            
        }
        
        */
    }
    
}

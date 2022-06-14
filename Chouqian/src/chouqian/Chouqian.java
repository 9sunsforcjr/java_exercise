/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chouqian;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Mactavish
 */
public class Chouqian {

    public static void main(String[] args) {
        /***************初始化**********************/
        int PEOPLE=24;
        int SEATS=10;
        HashMap mp=new HashMap();
        int i;
        String[] str={"贺宗博","徐航","宋宇杰","王浚","郭伊诺","陈馨仪",
                "徐栋","刘天立","王广凤","王泓晔","高学臻","陈永金","王程志",
                "刘鹏翔","刘建彬","王以宁","王乐童","许增锦","董雪莹","陈志威",
                "朱丽静","朱可佳","刘海涛","李灿"};
        for(i=0;i<PEOPLE;i++){
            mp.put(i,str[i]);
        }
        Set<Integer> set=new HashSet<>();
		while(true){
                    int a=(int)(Math.random()*PEOPLE);
                    
			set.add(a);
                        
			if(set.size()==SEATS){
                            break;
                        }
                        System.out.println(a);
		}
        Object rand[]=set.toArray();
        /*for(i=0;i<SEATS;i++){
            System.out.println(mp.get(rand[i]));
        }
*/
    }   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem.exercise.cx.ex2;

/**
 *
 * @author Mactavish
 */

/*
练习题2
有三类体育特长学生
1.举重类学生
属性：姓名，性别，出生年月日，速度，力量
行为：跑步(参数 米，返回值完成时间)
      举重（参数 公斤，返回值 能否举起）
2.跳高类学生
属性：姓名，性别，出生年月日，速度，弹跳高度
行为：跑步(参数 米，返回值完成时间)
      跳高（参数 高度，返回值 能否跳过）
3.篮球类学生
属性：姓名，性别，出生年月日，速度，命中率
行为：跑步(参数 米，返回值完成时间)
      投篮（参数 次数，返回值 投中个数）


根据要求完成设计，再设计一个类体育测试，设计方法跑步测试，参数是以上3类学生的一种和距离，返回完成时间


*/

public class Runprogram {
    public static void main(String [] args){
    WeightStu stu1=new WeightStu("小博",'F',2000,2,5);
    HighJumpStu stu2=new HighJumpStu("航哥",'M',1998,2,29);
    BasketballStu stu3=new BasketballStu("徐坤",'M',1999,11,31);
    stu1.setPower(100f);
    stu1.setSpeed(9.1f);
    stu2.setJumpHeight(2.3f);
    stu2.setSpeed(8.1f);
    stu3.setAccuracy(0.8f);
    stu3.setSpeed(9.4f);
    System.out.println("//////举重测试////////");
    System.out.println(stu1.lifting(199.9f));
    System.out.println("//////跳高测试////////");
    System.out.println(stu2.jump(2.1f));
    System.out.println("//////投篮测试////////");
    System.out.println(stu3.shot(9));    
    System.out.println("//////跑步测试////////");
    System.out.println(PETest.runningTest(stu1,100));
    System.out.println(PETest.runningTest(stu2,100));
    System.out.println(PETest.runningTest(stu3,200));

    
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

/**
 *
 * @author Mactavish
 * 设计一个名为Shape的类，一个float getArea(int r)方法，能够计算并返回半径为r的圆形
面积；一个float getArea(int width, int height)方法，能够计算并返回一个宽度为width，
高度为height的矩形面积（利用Math.PI获取π值）
 */
public class P1 {
    class Shape{
        float getArea(int r){
            return r*r*(float)Math.PI;
        }
        float getArea(int width,int height){
            return (float)width*height;
        }
    }
    
        public static void main(String argz[]) {

    }
}

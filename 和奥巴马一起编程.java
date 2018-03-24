package com.codeliu;

import java.util.Scanner;

/**
 * @author liu
 * @version 创建时间：2018年3月20日 下午7:11:32
 * 题目描述
 * 美国总统奥巴马不仅呼吁所有人都学习编程，甚至以身作则编写代码，成为美国历史上首位编写计算机代码的总统。
 * 2014年底，为庆祝“计算机科学教育周”正式启动，奥巴马编写了很简单的计算机代码：在屏幕上画一个正方形。
 * 现在你也跟他一起画吧！
 * 
 * 输入描述:
 * 输入在一行中给出正方形边长N（3<=N<=20）和组成正方形边的某种字符C，间隔一个空格。
 * 
 * 输出描述:
 * 输出由给定字符C画出的正方形。但是注意到行间距比列间距大，所以为了让结果看上去更像正方形，我们输出的
 * 行数实际上是列数的50%（四舍五入取整）。
 * 
 * 输入例子:
 * 10 a
 * 
 * 输出例子:
 * aaaaaaaaaa
 * a        a
 * a        a
 * a        a
 * aaaaaaaaaa
 */
public class 和奥巴马一起编程 {
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int length = read.nextInt();
        String c = read.next();
        long width = Math.round(length * 0.5);
        for(int i = 0; i < length; i++) {
            System.out.print(c);
        }
        System.out.println();
        for(int i = 1; i < width - 1; i++) {
            for(int j = 0; j < length; j++) {
                if(j == 0 || j == length - 1) {
                    System.out.print(c);
                } else {
                    System.out.print(" ");
                }
                    
            }
            System.out.println();
        }
        for(int i = 0; i < length; i++) {
            System.out.print(c);
        }
    }
}

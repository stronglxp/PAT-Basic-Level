package com.codeliu;

import java.util.Scanner;

/**
 * @author liu
 * @version 创建时间：2018年3月24日 下午2:33:23
 * 题目描述
 * 要获得一个C语言程序的运行时间，常用的方法是调用头文件time.h，其中提供了clock()函数，
 * 可以捕捉从程序开始运行到clock()被调用时所耗费的时间。这个时间单位是clock tick，即“时钟打点”。
 * 同时还有一个常数CLK_TCK，给出了机器时钟每秒所走的时钟打点数。于是为了获得一个函数f的运行时间，
 * 我们只要在调用f之前先调用clock()，获得一个时钟打点数C1；在f执行完成后再调用clock()，获得另一个时钟打点
 * 数C2；两次获得的时钟打点数之差(C2-C1)就是f运行所消耗的时钟打点数，再除以常数CLK_TCK，这里不妨简单假设常数CLK_TCK为100。
 * 现给定被测函数前后两次获得的时钟打点数，请你给出被测函数运行的时间。
 * 就得到了以秒为单位的运行时间。
 * 
 * 输入描述
 * 输入在一行中顺序给出2个整数C1和C1。注意两次获得的时钟打点数肯定不相同，即C1 < C2，并且取值在[0, 10^7]
 * 
 * 输出描述
 * 在一行中输出被测函数运行的时间。运行时间必须按照“hh:mm:ss”（即2位的“时:分:秒”）格式输出；不足1秒的时间四舍五入到秒。
 * 
 * 输入示例
 * 123 4577973
 * 
 * 输出结果
 * 12:42:59
 */
public class 程序运行时间 {
	 public static void main(String[] args) {
	        Scanner read = new Scanner(System.in);
	        int c1 = read.nextInt();
	        int c2 = read.nextInt();
	        int sum = (c2 - c1) / 100;
	        int h = sum / 3600;
	        sum = sum % 3600;
	        int m = sum / 60;
	        int s = sum % 60;
	        if(h < 10) {
	            System.out.print("0" + h + ":");
	        } else {
	            System.out.print(h + ":");
	        }
	        if(m < 10) {
	            System.out.print("0" + m + ":");
	        } else {
	            System.out.print(m + ":");
	        }
	        if(s < 10) {
	            System.out.print("0" + s);
	        } else {
	            System.out.print(s);
	        }
	    }
}

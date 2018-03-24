package com.codeliu;

import java.util.Scanner;

/**
 * @author liu
 * @version 创建时间：2018年3月10日 上午9:45:37
 * 题目描述
 * 正整数A的“DA（为1位整数）部分”定义为由A中所有DA组成的新整数PA。
 * 例如：给定A = 3862767，DA = 6，则A的“6部分”PA是66，因为A中有2个6。
 * 现给定A、DA、B、DB，请编写程序计算PA + PB。
 * 
 * 输入描述
 * 输入在一行中依次给出A、DA、B、DB，中间以空格分隔，其中0 < A, B < 10^10。
 * 
 * 输出描述
 * 在一行中输出PA + PB的值。
 * 
 * 输入例子
 * 3862767 6 13530293 3
 * 
 * 输出例子
 * 399
 */
public class 部分A_add_B {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int a = read.nextInt();
		int da = read.nextInt();
		int b = read.nextInt();
		int db = read.nextInt();
		
		StringBuilder x1 = new StringBuilder();
		StringBuilder x2 = new StringBuilder();
		String pa = Integer.toString(a);
		String pb = Integer.toString(b);
		String DA = Integer.toString(da);
		String DB = Integer.toString(db);
		for(int i = 0; i < pa.length(); i++) {
			if(pa.charAt(i) == DA.charAt(0)) {
				x1.append(da);
			}
		}
		for(int i = 0; i < pb.length(); i++) {
			if(pb.charAt(i) == DB.charAt(0)) {
				x2.append(db);
			}
		}
		
		if(x1.length() > 0 && x2.length() > 0) {
			System.out.println(Integer.parseInt(x1.toString()) + Integer.parseInt(x2.toString()));
		} else {
			System.out.println(0);
		}
		
	}
}

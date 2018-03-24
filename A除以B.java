package com.codeliu;
import java.util.*;
/**
 * @author liu
 * @version 创建时间：2018年3月10日 上午10:41:33
 * 题目描述
 * 本题要求计算A/B，其中A是不超过1000位的正整数，B是1位正整数。
 * 你需要输出商数Q和余数R，使得A = B * Q + R成立。
 * 
 * 输入描述
 * 输入在1行中依次给出A和B，中间以1空格分隔。
 * 
 * 输出描述
 * 在1行中依次输出Q和R，中间以1空格分隔。
 * 
 * 输入例子
 * 123456789050987654321 7
 * 
 * 输出例子
 * 17636684150141093474 3
 */
public class A除以B {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String A = read.next();
		int B = read.nextInt();
		divide(A, B);
	}
	private static void divide(String a, int b) {
		StringBuilder Q = new StringBuilder();
		char[] x = a.toCharArray();
		int s = 0, r = 0;
		for(int i = 0; i < x.length; i++) {
			s = r * 10 + Integer.parseInt(String.valueOf(x[i]));
			Q.append(s / b);
			r = s % b;
		}
		
		while(Q.charAt(0) == '0') {
			Q.deleteCharAt(0);
		}
		
		System.out.println(Q.toString() + " " + r);
	}
}

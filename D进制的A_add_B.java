package com.codeliu;

import java.util.Scanner;

/**
 * @author liu
 * @version 创建时间：2018年3月17日 上午11:02:20
 * 题目描述
 * 输入两个非负10进制整数A和B(<=2^30-1)，输出A+B的D (1 < D <= 10)进制数。
 * 
 * 输入描述
 * 输入在一行中依次给出3个整数A、B和D。
 * 
 * 输出描述
 * 输出A+B的D进制数。
 * 
 * 输入例子
 * 123 456 8
 * 
 * 输出结果
 * 1103
 */
public class D进制的A_add_B {
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int A = read.nextInt();
        int B = read.nextInt();
        int D = read.nextInt();
        StringBuffer s = new StringBuffer();
        int sum = A + B;
        if(sum == 0) {
            System.out.println("0");
        } else {
            while(sum != 0) {
                s.append(sum % D);
                sum = sum / D;
            }
            s.reverse();
            System.out.println(s.toString());
        }
    }
}

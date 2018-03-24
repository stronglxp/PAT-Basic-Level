package com.codeliu;

import java.util.Scanner;

/**
 * @author liu
 * @version 创建时间：2018年3月24日 下午12:57:51
 * 题目描述
 * 给定区间[-2的31次方, 2的31次方]内的3个整数A、B和C，请判断A+B是否大于C。
 * 
 * 输入描述
 * 输入第1行给出正整数T(<=10)，是测试用例的个数。随后给出T组测试用例，每组占一行，顺序给出A、B和C。整数间以空格分隔。
 * 
 * 输出描述
 * 对每组测试用例，在一行中输出“Case #X: true”如果A+B>C，否则输出“Case #X: false”，其中X是测试用例的编号（从1开始）。
 * 
 * 输入示例
 * 4
 * 1 2 3
 * 2 3 4
 * 2147483647 0 2147483646
 * 0 -2147483648 -2147483647
 * 
 * 输出结果
 * Case #1: false
 * Case #2: true
 * Case #3: true
 * Case #4: false
 */
public class A_add_B_and_C {
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int i = 1;
        while(n > 0) {
            long a = read.nextLong();
            long b = read.nextLong();
            long c = read.nextLong();
            if((a + b) > c) {
                System.out.println("Case #" + i + ": true");
                i++;
                n--;
            } else {
                System.out.println("Case #" + i + ": false");
                i++;
                n--;
            }
        }
    }
}

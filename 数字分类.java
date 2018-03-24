package com.codeliu;

import java.util.Scanner;

/**
 * @author liu
 * @version 创建时间：2018年3月24日 下午1:02:18
 * 问题描述
 * 给定一系列正整数，请按要求对数字进行分类，并输出以下5个数字：
 * A1 = 能被5整除的数字中所有偶数的和；
 * A2 = 将被5除后余1的数字按给出顺序进行交错求和，即计算n1-n2+n3-n4...；
 * A3 = 被5除后余2的数字的个数；
 * A4 = 被5除后余3的数字的平均数，精确到小数点后1位；
 * A5 = 被5除后余4的数字中最大数字。
 * 
 * 输入描述
 * 每个输入包含1个测试用例。每个测试用例先给出一个不超过1000的正整数N，随后给出N个不超过1000的待分类的正整数。
 * 数字间以空格分隔。
 * 
 * 输出描述
 * 对给定的N个正整数，按题目要求计算A1~A5并在一行中顺序输出。数字间以空格分隔，但行末不得有多余空格。
 * 若其中某一类数字不存在，则在相应位置输出“N”。
 * 
 * 输入示例
 * 13 1 2 3 4 5 6 7 8 9 10 20 16 18
 * 
 * 输出结果
 * 30 11 2 9.7 9
 */
public class 数字分类 {
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] a = new int[n];
        int a1 = 0,a2 = 0,a3 = 0,a4 = 0,a5 = 0;
        int flag = 1;
        int count = 0;
        for(int i = 0; i < n; i++) {
            a[i] = read.nextInt();
        }
        for(int i = 0;i < n; i++) {
            if((a[i] % 5) == 0) {
                if(a[i] % 2 == 0) {
                    a1 += a[i];
                }
            } else if(a[i] % 5 == 1) {
                a2 += ((flag) * a[i]);
                flag = -flag;
            } else if(a[i] % 5 == 2) {
                a3++;
            } else if(a[i] % 5 == 3) {
                a4 += a[i];
                count++;
            } else if(a[i] % 5 == 4) {
                if(a[i] > a5) {
                    a5 = a[i];
                }
            }
        }
        if(a1 == 0) {
            System.out.print("N ");
        } else {
            System.out.print(a1 + " ");
        }
        if(a2 == 0) {
            System.out.print("N ");
        } else {
            System.out.print(a2 + " ");
        }
        if(a3 == 0) {
            System.out.print("N ");
        } else {
            System.out.print(a3 + " ");
        }
        if(count != 0) {
            float ave = (float)a4 / count;
            System.out.format("%.1f" , ave);
        } else {
            System.out.print("N");
        }
        if(a5 == 0) {
            System.out.print(" N");
        } else {
            System.out.print(" " + a5);
        }
    }
}

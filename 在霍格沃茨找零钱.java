package com.codeliu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author liu
 * @version 创建时间：2018年3月21日 上午11:38:22
 * 题目描述
 * 如果你是哈利·波特迷，你会知道魔法世界有它自己的货币系统 —— 就如海格告诉哈利的：
 * “十七个银西可(Sickle)兑一个加隆(Galleon)，二十九个纳特(Knut)兑一个西可，很容易。”现在，
 * 给定哈利应付的价钱P和他实付的钱A，你的任务是写一个程序来计算他应该被找的零钱。
 * 
 * 输入描述
 * 输入在1行中分别给出P和A，格式为“Galleon.Sickle.Knut”，其间用1个空格分隔。
 * 这里Galleon是[0, 10^7]]区间内的整数，Sickle是[0, 17)区间内的整数，Knut是[0, 29)区间内的整数。
 * 
 * 输出描述
 * 在一行中用与输入同样的格式输出哈利应该被找的零钱。如果他没带够钱，那么输出的应该是负数。
 * 
 * 输入示例
 * 10.16.27 14.1.28
 * 
 * 输出结果
 * 3.2.1
 */
public class 在霍格沃茨找零钱 {
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String p = read.next();
        String a = read.next();
        // 应付的
        String[] p1 = p.split("\\.");
        // 身上带的
        String[] a1 = a.split("\\.");
        int[] p2 = new int[3];
        int[] a2 = new int[3];
        for(int i = 0; i < 3; i++) {
            p2[i] = Integer.parseInt(p1[i]);
            a2[i] = Integer.parseInt(a1[i]);
        }
        
        if(a2[0] > p2[0]) {
            counts(a2, p2, true);
        } else {
            counts(p2, a2, false);
        }
    }
    
    static void counts(int[] a2, int[] p2, boolean flag) {
        int a = a2[0];
        int b = a2[1];
        int c = a2[2] - p2[2];
        if(c < 0) {
            c += 29;
            b -= 1;
        } 
        b -= p2[1];
        if(b < 0) {
            b += 17;
            a -= 1;
        }
        a -= p2[0];
        if(!flag) {
            System.out.print("-");
        }
        System.out.print(a + "." + b + "." + c);
    }
}

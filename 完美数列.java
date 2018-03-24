package com.codeliu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author liu
 * @version 创建时间：2018年3月19日 下午7:33:23
 * 题目描述
 * 给定一个正整数数列，和正整数p，设这个数列中的最大值是M，最小值是m，如果M <= m * p，则称这个数列是完美数列。
 * 现在给定参数p和一些正整数，请你从中选择尽可能多的数构成一个完美数列。
 * 
 * 输入描述
 * 输入第一行给出两个正整数N和p，其中N（<= 10^5）是输入的正整数的个数，p（<= 10^9）是给定的参数。
 * 第二行给出N个正整数，每个数不超过10^9。
 * 
 * 输出描述
 * 在一行中输出最多可以选择多少个数可以用它们组成一个完美数列。
 * 
 * 输入示例
 * 10 8
 * 2 3 20 4 5 1 6 7 8 9
 * 
 * 输出结果
 * 8
 */
public class 完美数列 {
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int p = read.nextInt();
        int[] result = new int[n];
        for(int i = 0; i < n; i++) {
            result[i] = read.nextInt();
        }
        Arrays.sort(result);
        int len1 = 0;
        int len2 = 0;
        int i = 0, j = result.length - 1;
        while(result[i] * p < result[j]) {
            i++;
        } 
        len1 = result.length - i;
        i = 0;
        while(result[i] * p < result[j]) {
            j--;
        }
        len2 = j + 1;
        int max = len1 > len2 ? len1 : len2;
        System.out.println(max);
    }
}

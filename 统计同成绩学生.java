package com.codeliu;

import java.util.Scanner;

/**
 * @author liu
 * @version 创建时间：2018年3月20日 下午7:28:03
 * 题目描述
 * 本题要求读入N名学生的成绩，将获得某一给定分数的学生人数输出。
 * 
 * 输入描述
 * 输入在第1行给出不超过10^5的正整数N，即学生总人数。随后1行给出N名学生的百分制整数成绩，中间以空格分隔。
 * 最后1行给出要查询的分数个数K（不超过N的正整数），随后是K个分数，中间以空格分隔。
 * 
 * 输出描述
 * 在一行中按查询顺序给出得分等于指定分数的学生人数，中间以空格分隔，但行末不得有多余空格。
 * 
 * 输入示例
 * 10
 * 60 75 90 55 75 99 82 90 75 50
 * 3 75 90 88
 * 
 * 输出结果
 * 3 2 0
 */
public class 统计同成绩学生 {
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] score = new int[n];
        for(int i = 0; i < n; i++) {
            score[i] = read.nextInt();
        }
        int findNum = read.nextInt();
        int[] findScore = new int[findNum];
        int[] counts = new int[findNum];
        for(int i = 0; i < findNum; i++) {
            findScore[i] = read.nextInt();
            counts[i] = 0;
        }
        for(int i = 0; i < findNum; i++) {
            for(int j = 0; j < n; j++) {
                if(score[j] == findScore[i]) {
                    counts[i]++;
                }
            }
        }
        for(int i = 0; i < findNum; i++) {
            if(i == findNum - 1) {
                System.out.print(counts[i]);
            } else {
                System.out.print(counts[i] + " ");
            }
        }
    }
}

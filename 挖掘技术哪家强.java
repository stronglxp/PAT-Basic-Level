package com.codeliu;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author liu
 * @version 创建时间：2018年3月20日 下午2:19:24
 * 题目描述
 * 为了用事实说明挖掘机技术到底哪家强，PAT组织了一场挖掘机技能大赛。现请你根据比赛结果统计出技术最强的那个学校。
 * 
 * 输入描述
 * 输入在第1行给出不超过10^5的正整数N，即参赛人数。随后N行，每行给出一位参赛者的信息和成绩，
 * 包括其所代表的学校的编号（从1开始连续编号）、及其比赛成绩（百分制），中间以空格分隔。
 * 
 * 输出描述
 * 在一行中给出总得分最高的学校的编号、及其总分，中间以空格分隔。题目保证答案唯一，没有并列。
 * 
 * 输入示例
 * 6
 * 3 65
 * 2 80
 * 1 100
 * 2 70
 * 3 40
 * 3 0
 * 
 * 输出结果
 * 2 150
 */
public class 挖掘技术哪家强 {
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        TreeMap<Integer, Integer> result = new TreeMap<Integer, Integer>();
        for(int i = 0; i < n; i++) {
            int id = read.nextInt();
            int score = read.nextInt();
            if(result.containsKey(id)) {
                result.put(id, result.get(id) + score);
            } else {
                result.put(id, score);
            }
        }
        int max = 0;
        int flag = 1;
        for(int i = result.firstKey(); i <= result.lastKey(); i++) {
            if(result.containsKey(i)) {
                if(result.get(i) > max) {
                    max = result.get(i);
                    flag = i;
                }
            }
        }
        System.out.println(flag + " " + max);
    }
}

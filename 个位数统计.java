package com.codeliu;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author liu
 * @version 创建时间：2018年3月17日 上午10:48:44
 * 题目描述
 * 给定一个k位整数N = dk-1*10k-1 + ... + d1*101 + d0 (0<=di<=9, i=0,...,k-1, dk-1>0)，
 * 请编写程序统计每种不同的个位数字出现的次数。例如：给定N = 100311，则有2个0，3个1，和1个3。
 * 
 * 输入描述
 * 每个输入包含1个测试用例，即一个不超过1000位的正整数N。
 * 
 * 输出描述
 * 对N中每一种不同的个位数字，以D:M的格式在一行中输出该位数字D及其在N中出现的次数M。要求按D的升序输出。
 * 
 * 输入例子
 * 100311
 * 
 * 输出结果
 * 0:2
 * 1:3
 * 3:1
 */
public class 个位数统计 {
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String N = read.next();
        char[] r = N.toCharArray();
        Map<Integer, Integer> result = new TreeMap<Integer, Integer>();
        for(int i = 0; i < r.length; i++) {
            if(result.containsKey(r[i] - '0')) {
                result.put(r[i] - '0', result.get(r[i] - '0') + 1);
            } else {
                result.put(r[i] - '0', 1);
            }
        }
        for(int i:result.keySet()) {
            System.out.println(i + ":" + result.get(i));
        }
    }
}

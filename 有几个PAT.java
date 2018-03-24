package com.codeliu;

import java.util.Scanner;

/**
 * @author liu
 * @version 创建时间：2018年3月21日 下午1:03:53
 * 题目描述
 * 字符串APPAPT中包含了两个单词“PAT”，其中第一个PAT是第2位(P),第4位(A),第6位(T)；
 * 第二个PAT是第3位(P),第4位(A),第6位(T)。现给定字符串，问一共可以形成多少个PAT？
 * 
 * 输入描述
 * 输入只有一行，包含一个字符串，长度不超过10^5，只包含P、A、T三种字母。
 * 
 * 输出描述
 * 在一行中输出给定字符串中包含多少个PAT。由于结果可能比较大，只输出对1000000007取余数的结果。
 * 
 * 输入示例
 * APPAPT
 * 
 * 输出结果
 * 2
 * 总体思路：统计pat需要pa的数量，统计pa需要p的数量，一步一步判断即可
 */
public class 有几个PAT {
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String s = read.next();
        char[] r = s.toCharArray();
        int p = 0, pa = 0, pat = 0;
        for(int i = 0; i < r.length; i++) {
            if(r[i] == 'P') {
            	p++;
            } else if(r[i] == 'A') {
            	pa = (pa + p) % 1000000007;
            } else {
            	pat = (pat + pa) % 1000000007;
            }
        }
        System.out.println(pat % 1000000007);
    }
}

package com.codeliu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author liu
 * @version 创建时间：2018年3月19日 下午7:09:30
 * 题目描述
 * 旧键盘上坏了几个键，于是在敲一段文字的时候，对应的字符就不会出现。现在给出应该输入的一段文字、
 * 以及实际被输入的文字，请你列出肯定坏掉的那些键
 * 
 * 输入描述
 * 输入在2行中分别给出应该输入的文字、以及实际被输入的文字。每段文字是不超过80个字符的串，
 * 由字母A-Z（包括大、小写）、数字0-9、以及下划线“_”（代表空格）组成。题目保证2个字符串均非空。
 * 
 * 输出描述
 * 按照发现顺序，在一行中输出坏掉的键。其中英文字母只输出大写，每个坏键只输出一次。题目保证至少有1个坏键。
 * 
 * 输入示例
 * 7_This_is_a_test
 * _hs_s_a_es
 * 
 * 输出结果
 * 7TI
 */
public class 旧键盘 {
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        // 应该输入的
        String s1 = read.next();
        // 实际输入的
        String s2 = read.next();
        ArrayList<Character> result = new ArrayList<Character>();
        char[] ss2 = new char[s1.toCharArray().length];
        for(int x = 0; x < s2.length(); x++) {
        	ss2[x] = s2.charAt(x);
        }
        char[] ss1 = s1.toCharArray();
        int i = 0, j = 0;
        while(i < ss1.length && j < ss1.length) {
            if(ss1[i] != ss2[j]) {
                if(!result.contains(Character.toUpperCase(ss1[i]))) {
                    result.add(Character.toUpperCase(ss1[i]));
                }
                i++;
            } else {
                i++;
                j++;
            }
        }
        for(int m = 0; m < result.size(); m++) {
            if(result.get(m) >= 'a' && result.get(m) <= 'z') {
                System.out.print(result.get(m));
            } else {
                System.out.print(result.get(m));
            }
        }
    }
}

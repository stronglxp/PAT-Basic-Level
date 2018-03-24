package com.codeliu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author liu
 * @version 创建时间：2018年3月20日 下午2:57:05
 * 题目描述
 * 旧键盘上坏了几个键，于是在敲一段文字的时候，对应的字符就不会出现。现在给出应该输入的一段文字、以及坏掉的那些键，
 * 打出的结果文字会是怎样？
 * 
 * 输入描述
 * 输入在2行中分别给出坏掉的那些键、以及应该输入的文字。其中对应英文字母的坏键以大写给出；每段文字是不超过10^5个字符
 * 的串。可用的字符包括字母[a-z, A-Z]、数字0-9、以及下划线“_”（代表空格）、“,”、“.”、“-”、“+”（代表上档键）。
 * 题目保证第2行输入的文字串非空。注意：如果上档键坏掉了，那么大写的英文字母无法被打出。
 * 
 * 输出描述
 * 在一行中输出能够被打出的结果文字。如果没有一个字符能被打出，则输出空行。
 * 
 * 输入示例
 * 7+IE.
 * 7_This_is_a_test.
 * 
 * 输出结果
 * _hs_s_a_tst
 */
public class 旧键盘打字 {
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String error = read.nextLine();
        String input = read.nextLine();
        if(error.length() == 0) {
            System.out.println(input);
            return;
        }
        ArrayList<Character> s1 = new ArrayList<Character>();
        for(int i = 0; i < error.length(); i++) {
        	s1.add(error.charAt(i));
        }
        ArrayList<Character> s2 = new ArrayList<Character>();
        for(int i = 0; i < input.length(); i++) {
        	s2.add(input.charAt(i));
        }
        boolean flag = false;
        for(int i = 0; i < s1.size(); i++) {
            if(s1.get(i) == '+') {
            	s1.remove(i);
                flag = true;
                break;
            }
        }
        if(flag) {
            for(int i = 0; i < s2.size(); i++) {
                if(Character.isUpperCase(s2.get(i))) {
                    s2.remove(i);
                    // 元素前移了
                    i--;
                }
            } 
        }
        for(int i = 0; i < s1.size(); i++) {
            for(int j = 0; j < s2.size(); j++) {
            	if(Character.isUpperCase(s1.get(i))) {
            		if(Character.toLowerCase(s2.get(j)) == Character.toLowerCase(s1.get(i))) {
            			s2.remove(j);
            			j--;
            		}
            	} else {
            		if(s2.get(j) == s1.get(i)) {
            			s2.remove(j);
            			j--;
                    }
            	}
            }
        }
        if(s2.size() == 0) {
            System.out.println();
        } else {
            for(int i = 0; i < s2.size(); i++) {
                System.out.print(s2.get(i));
            }
        }
    }
}

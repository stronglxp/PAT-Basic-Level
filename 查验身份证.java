package com.codeliu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author liu
 * @version 创建时间：2018年3月19日 下午9:15:54
 * 题目描述
 * 一个合法的身份证号码由17位地区、日期编号和顺序编号加1位校验码组成。校验码的计算规则如下：
 * 首先对前17位数字加权求和，权重分配为：{7，9，10，5，8，4，2，1，6，3，7，9，10，5，8，4，2}；
 * 然后将计算的和对11取模得到值Z；最后按照以下关系对应Z值与校验码M的值：
 * Z：0 1 2 3 4 5 6 7 8 9 10
 * M：1 0 X 9 8 7 6 5 4 3 2
 * 现在给定一些身份证号码，请你验证校验码的有效性，并输出有问题的号码。
 * 
 * 输入描述
 * 输入第一行给出正整数N（<= 100）是输入的身份证号码的个数。随后N行，每行给出1个18位身份证号码。
 * 
 * 输出描述
 * 按照输入的顺序每行输出1个有问题的身份证号码。这里并不检验前17位是否合理，只检查前17位是否全为数字且最后
 * 1位校验码计算准确。如果所有号码都正常，则输出“All passed”。
 * 
 * 输入示例
 * 4
 * 320124198808240056
 * 12010X198901011234
 * 110108196711301866
 * 37070419881216001X
 * 
 * 输出结果
 * 12010X198901011234
 * 110108196711301866
 * 37070419881216001X
 */
public class 查验身份证 {
	static char[] s1 = new char[]{'1','0','X','9','8','7','6','5','4','3','2'};
    static int[] s2 = new int[]{7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        String[] errors = new String[n];
        int count = 0;
        for(int i = 0; i < n; i++) {
            String s = read.next();
            if(!check(s)) {
            	errors[count++] = s;
            }
        }
        if(count == 0) {
        	System.out.println("All passed");
        } else {
        	for(int i = 0; i < count; i++) {
        		System.out.println(errors[i]);
        	}
        }
    }
	private static boolean check(String s) {
		int sum = 0;
		char[] x = s.toCharArray();
		boolean flag = true;
		for(int i = 0; i < x.length - 1; i++) {
			if(x[i] >= '0' && x[i] <= '9') {
				sum += (x[i] - '0') * s2[i];
			} else {
				flag = false;
				break;
			}
		}
		if(flag) {
			sum = sum % 11;
			if(s1[sum] == x[17]) {
				return true;
			}
		} else {
			return false;
		}
		return false;
	}
}

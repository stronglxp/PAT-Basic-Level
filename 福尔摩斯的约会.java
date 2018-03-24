package com.codeliu;

import java.util.Scanner;

/**
 * 福尔摩斯的约会
 * 题目描述
 * 大侦探福尔摩斯接到一张奇怪的字条：“我们约会吧！ 3485djDkxh4hhGE 2984akDfkkkkggEdsb
 * s&hgsfdk d&Hyscvnm”。大侦探很快就明白了，字条上奇怪的乱码实际上就是约会的时间“星期四 14:04”，
 * 因为前面两字符串中第1对相同的大写英文字母（大小写有区分）是第4个字母'D'，代表星期四；第2对相同的
 * 字符是'E'，那是第5个英文字母，代表一天里的第14个钟头（于是一天的0点到23点由数字0到9、以及大写字
 * 母A到N表示）；后面两字符串第1对相同的英文字母's'出现在第4个位置（从0开始计数）上，代表第4分钟。
 * 现给定两对字符串，请帮助福尔摩斯解码得到约会的时间。
 * 
 * 输入描述:
 * 输入在4行中分别给出4个非空、不包含空格、且长度不超过60的字符串。
 * 
 * 输出描述:
 * 在一行中输出约会的时间，格式为“DAY HH:MM”，其中“DAY”是某星期的3字符缩写，即MON表示星期一，
 * TUE表示星期二，WED表示星期三，THU表示星期四，FRI表示星期五，SAT表示星期六，SUN表示星期日。
 * 题目输入保证每个测试存在唯一解。
 * 
 * 输入例子:
 * 3485djDkxh4hhGE
 * 2984akDfkkkkggEdsb
 * s&hgsfdk
 * d&Hyscvnm
 * 
 * 输出例子:
 * THU 14:04
 *
 * @author liu
 * @version 创建时间：2018年3月9日 下午4:19:27
 */
public class 福尔摩斯的约会 {
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String[] s = new String[4];
        int i = 0, count = 1;
        for(int m = 0; m < 4; m++) {
            s[m] = read.nextLine();
        }
        char[] c0 = s[0].toCharArray();
        char[] c1 = s[1].toCharArray();
        char[] c2 = s[2].toCharArray();
        char[] c3 = s[3].toCharArray();
        int l0 = s[0].length();
        int l1 = s[2].length();
        if(s[0].length() > s[1].length()) {
        	l0 = s[1].length();
        }
        if(s[2].length() > s[3].length()) {
        	l1 = s[3].length();
        }
        while(i < l0) {
        	if(c0[i] == c1[i]) {
        		if(c0[i] >= 'A' && c0[i] <= 'G' && count == 1) {
                        int d = c0[i] - 'A' + 1;
                        switch(d) {
                            case 1:System.out.print("MON ");break;
                            case 2:System.out.print("TUE ");break;
                            case 3:System.out.print("WED ");break;
                            case 4:System.out.print("THU ");break;
                            case 5:System.out.print("FRI ");break;
                            case 6:System.out.print("SAT ");break;
                            case 7:System.out.print("SUN ");break;
                        }
                        count++;
                        i++;
                        continue;
        		} 
        		if(count == 2) {
        			if(c0[i] >= '0' && c0[i] <= '9') {
            			System.out.print("0" + c0[i] + ":");
            		}
            		if(c0[i] >= 'A' && c0[i] <= 'N') {
            			int d = c0[i] - 'A' + 1;
            			System.out.print(9 + d + ":");
            		}
            		break;
        		}
            }
        	i++;
        }
        i = 0;
        while(i < l1) {
            if(c2[i] == c3[i] && (c2[i] >= 'a' && c2[i] <= 'z') || (c2[i] >= 'A' && c2[i] <= 'Z')) {
                if(i >= 0 && i <= 9) {
                    System.out.print("0" + i);
                } else {
                    System.out.print(i);
                }
                break;
            }
            i++;
        }
    }
}

package com.codeliu;

import java.util.Scanner;

/**
 * ����Ħ˹��Լ��
 * ��Ŀ����
 * ����̽����Ħ˹�ӵ�һ����ֵ�������������Լ��ɣ� 3485djDkxh4hhGE 2984akDfkkkkggEdsb
 * s&hgsfdk d&Hyscvnm��������̽�ܿ�������ˣ���������ֵ�����ʵ���Ͼ���Լ���ʱ�䡰������ 14:04����
 * ��Ϊǰ�����ַ����е�1����ͬ�Ĵ�дӢ����ĸ����Сд�����֣��ǵ�4����ĸ'D'�����������ģ���2����ͬ��
 * �ַ���'E'�����ǵ�5��Ӣ����ĸ������һ����ĵ�14����ͷ������һ���0�㵽23��������0��9���Լ���д��
 * ĸA��N��ʾ�����������ַ�����1����ͬ��Ӣ����ĸ's'�����ڵ�4��λ�ã���0��ʼ�������ϣ������4���ӡ�
 * �ָ��������ַ��������������Ħ˹����õ�Լ���ʱ�䡣
 * 
 * ��������:
 * ������4���зֱ����4���ǿա��������ո��ҳ��Ȳ�����60���ַ�����
 * 
 * �������:
 * ��һ�������Լ���ʱ�䣬��ʽΪ��DAY HH:MM�������С�DAY����ĳ���ڵ�3�ַ���д����MON��ʾ����һ��
 * TUE��ʾ���ڶ���WED��ʾ��������THU��ʾ�����ģ�FRI��ʾ�����壬SAT��ʾ��������SUN��ʾ�����ա�
 * ��Ŀ���뱣֤ÿ�����Դ���Ψһ�⡣
 * 
 * ��������:
 * 3485djDkxh4hhGE
 * 2984akDfkkkkggEdsb
 * s&hgsfdk
 * d&Hyscvnm
 * 
 * �������:
 * THU 14:04
 *
 * @author liu
 * @version ����ʱ�䣺2018��3��9�� ����4:19:27
 */
public class ����Ħ˹��Լ�� {
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

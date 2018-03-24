package com.codeliu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author liu
 * @version ����ʱ�䣺2018��3��19�� ����9:15:54
 * ��Ŀ����
 * һ���Ϸ������֤������17λ���������ڱ�ź�˳���ż�1λУ������ɡ�У����ļ���������£�
 * ���ȶ�ǰ17λ���ּ�Ȩ��ͣ�Ȩ�ط���Ϊ��{7��9��10��5��8��4��2��1��6��3��7��9��10��5��8��4��2}��
 * Ȼ�󽫼���ĺͶ�11ȡģ�õ�ֵZ����������¹�ϵ��ӦZֵ��У����M��ֵ��
 * Z��0 1 2 3 4 5 6 7 8 9 10
 * M��1 0 X 9 8 7 6 5 4 3 2
 * ���ڸ���һЩ���֤���룬������֤У�������Ч�ԣ������������ĺ��롣
 * 
 * ��������
 * �����һ�и���������N��<= 100������������֤����ĸ��������N�У�ÿ�и���1��18λ���֤���롣
 * 
 * �������
 * ���������˳��ÿ�����1������������֤���롣���ﲢ������ǰ17λ�Ƿ����ֻ���ǰ17λ�Ƿ�ȫΪ���������
 * 1λУ�������׼ȷ��������к��붼�������������All passed����
 * 
 * ����ʾ��
 * 4
 * 320124198808240056
 * 12010X198901011234
 * 110108196711301866
 * 37070419881216001X
 * 
 * ������
 * 12010X198901011234
 * 110108196711301866
 * 37070419881216001X
 */
public class �������֤ {
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

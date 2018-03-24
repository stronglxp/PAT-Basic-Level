package com.codeliu;

import java.util.Scanner;

/**
 * @author liu
 * @version ����ʱ�䣺2018��3��24�� ����12:57:51
 * ��Ŀ����
 * ��������[-2��31�η�, 2��31�η�]�ڵ�3������A��B��C�����ж�A+B�Ƿ����C��
 * 
 * ��������
 * �����1�и���������T(<=10)���ǲ��������ĸ�����������T�����������ÿ��ռһ�У�˳�����A��B��C���������Կո�ָ���
 * 
 * �������
 * ��ÿ�������������һ���������Case #X: true�����A+B>C�����������Case #X: false��������X�ǲ��������ı�ţ���1��ʼ����
 * 
 * ����ʾ��
 * 4
 * 1 2 3
 * 2 3 4
 * 2147483647 0 2147483646
 * 0 -2147483648 -2147483647
 * 
 * ������
 * Case #1: false
 * Case #2: true
 * Case #3: true
 * Case #4: false
 */
public class A_add_B_and_C {
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int i = 1;
        while(n > 0) {
            long a = read.nextLong();
            long b = read.nextLong();
            long c = read.nextLong();
            if((a + b) > c) {
                System.out.println("Case #" + i + ": true");
                i++;
                n--;
            } else {
                System.out.println("Case #" + i + ": false");
                i++;
                n--;
            }
        }
    }
}

package com.codeliu;

import java.util.Scanner;

/**
 * @author liu
 * @version ����ʱ�䣺2018��3��17�� ����11:02:20
 * ��Ŀ����
 * ���������Ǹ�10��������A��B(<=2^30-1)�����A+B��D (1 < D <= 10)��������
 * 
 * ��������
 * ������һ�������θ���3������A��B��D��
 * 
 * �������
 * ���A+B��D��������
 * 
 * ��������
 * 123 456 8
 * 
 * ������
 * 1103
 */
public class D���Ƶ�A_add_B {
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int A = read.nextInt();
        int B = read.nextInt();
        int D = read.nextInt();
        StringBuffer s = new StringBuffer();
        int sum = A + B;
        if(sum == 0) {
            System.out.println("0");
        } else {
            while(sum != 0) {
                s.append(sum % D);
                sum = sum / D;
            }
            s.reverse();
            System.out.println(s.toString());
        }
    }
}

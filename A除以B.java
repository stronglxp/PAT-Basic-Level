package com.codeliu;
import java.util.*;
/**
 * @author liu
 * @version ����ʱ�䣺2018��3��10�� ����10:41:33
 * ��Ŀ����
 * ����Ҫ�����A/B������A�ǲ�����1000λ����������B��1λ��������
 * ����Ҫ�������Q������R��ʹ��A = B * Q + R������
 * 
 * ��������
 * ������1�������θ���A��B���м���1�ո�ָ���
 * 
 * �������
 * ��1�����������Q��R���м���1�ո�ָ���
 * 
 * ��������
 * 123456789050987654321 7
 * 
 * �������
 * 17636684150141093474 3
 */
public class A����B {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String A = read.next();
		int B = read.nextInt();
		divide(A, B);
	}
	private static void divide(String a, int b) {
		StringBuilder Q = new StringBuilder();
		char[] x = a.toCharArray();
		int s = 0, r = 0;
		for(int i = 0; i < x.length; i++) {
			s = r * 10 + Integer.parseInt(String.valueOf(x[i]));
			Q.append(s / b);
			r = s % b;
		}
		
		while(Q.charAt(0) == '0') {
			Q.deleteCharAt(0);
		}
		
		System.out.println(Q.toString() + " " + r);
	}
}

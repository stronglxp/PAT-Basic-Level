package com.codeliu;

import java.util.Scanner;

/**
 * @author liu
 * @version ����ʱ�䣺2018��3��10�� ����9:45:37
 * ��Ŀ����
 * ������A�ġ�DA��Ϊ1λ���������֡�����Ϊ��A������DA��ɵ�������PA��
 * ���磺����A = 3862767��DA = 6����A�ġ�6���֡�PA��66����ΪA����2��6��
 * �ָ���A��DA��B��DB�����д�������PA + PB��
 * 
 * ��������
 * ������һ�������θ���A��DA��B��DB���м��Կո�ָ�������0 < A, B < 10^10��
 * 
 * �������
 * ��һ�������PA + PB��ֵ��
 * 
 * ��������
 * 3862767 6 13530293 3
 * 
 * �������
 * 399
 */
public class ����A_add_B {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int a = read.nextInt();
		int da = read.nextInt();
		int b = read.nextInt();
		int db = read.nextInt();
		
		StringBuilder x1 = new StringBuilder();
		StringBuilder x2 = new StringBuilder();
		String pa = Integer.toString(a);
		String pb = Integer.toString(b);
		String DA = Integer.toString(da);
		String DB = Integer.toString(db);
		for(int i = 0; i < pa.length(); i++) {
			if(pa.charAt(i) == DA.charAt(0)) {
				x1.append(da);
			}
		}
		for(int i = 0; i < pb.length(); i++) {
			if(pb.charAt(i) == DB.charAt(0)) {
				x2.append(db);
			}
		}
		
		if(x1.length() > 0 && x2.length() > 0) {
			System.out.println(Integer.parseInt(x1.toString()) + Integer.parseInt(x2.toString()));
		} else {
			System.out.println(0);
		}
		
	}
}

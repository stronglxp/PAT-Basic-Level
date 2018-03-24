package com.codeliu;

import java.util.Scanner;

/**
 * @author liu
 * @version ����ʱ�䣺2018��3��24�� ����1:02:18
 * ��������
 * ����һϵ�����������밴Ҫ������ֽ��з��࣬���������5�����֣�
 * A1 = �ܱ�5����������������ż���ĺͣ�
 * A2 = ����5������1�����ְ�����˳����н�����ͣ�������n1-n2+n3-n4...��
 * A3 = ��5������2�����ֵĸ�����
 * A4 = ��5������3�����ֵ�ƽ��������ȷ��С�����1λ��
 * A5 = ��5������4��������������֡�
 * 
 * ��������
 * ÿ���������1������������ÿ�����������ȸ���һ��������1000��������N��������N��������1000�Ĵ��������������
 * ���ּ��Կո�ָ���
 * 
 * �������
 * �Ը�����N��������������ĿҪ�����A1~A5����һ����˳����������ּ��Կո�ָ�������ĩ�����ж���ո�
 * ������ĳһ�����ֲ����ڣ�������Ӧλ�������N����
 * 
 * ����ʾ��
 * 13 1 2 3 4 5 6 7 8 9 10 20 16 18
 * 
 * ������
 * 30 11 2 9.7 9
 */
public class ���ַ��� {
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] a = new int[n];
        int a1 = 0,a2 = 0,a3 = 0,a4 = 0,a5 = 0;
        int flag = 1;
        int count = 0;
        for(int i = 0; i < n; i++) {
            a[i] = read.nextInt();
        }
        for(int i = 0;i < n; i++) {
            if((a[i] % 5) == 0) {
                if(a[i] % 2 == 0) {
                    a1 += a[i];
                }
            } else if(a[i] % 5 == 1) {
                a2 += ((flag) * a[i]);
                flag = -flag;
            } else if(a[i] % 5 == 2) {
                a3++;
            } else if(a[i] % 5 == 3) {
                a4 += a[i];
                count++;
            } else if(a[i] % 5 == 4) {
                if(a[i] > a5) {
                    a5 = a[i];
                }
            }
        }
        if(a1 == 0) {
            System.out.print("N ");
        } else {
            System.out.print(a1 + " ");
        }
        if(a2 == 0) {
            System.out.print("N ");
        } else {
            System.out.print(a2 + " ");
        }
        if(a3 == 0) {
            System.out.print("N ");
        } else {
            System.out.print(a3 + " ");
        }
        if(count != 0) {
            float ave = (float)a4 / count;
            System.out.format("%.1f" , ave);
        } else {
            System.out.print("N");
        }
        if(a5 == 0) {
            System.out.print(" N");
        } else {
            System.out.print(" " + a5);
        }
    }
}

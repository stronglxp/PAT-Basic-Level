package com.codeliu;

import java.util.Scanner;

/**
 * @author liu
 * @version ����ʱ�䣺2018��3��20�� ����7:11:32
 * ��Ŀ����
 * ������ͳ�°��������������˶�ѧϰ��̣��������������д���룬��Ϊ������ʷ����λ��д������������ͳ��
 * 2014��ף�Ϊ��ף���������ѧ�����ܡ���ʽ�������°����д�˺ܼ򵥵ļ�������룺����Ļ�ϻ�һ�������Ρ�
 * ������Ҳ����һ�𻭰ɣ�
 * 
 * ��������:
 * ������һ���и��������α߳�N��3<=N<=20������������αߵ�ĳ���ַ�C�����һ���ո�
 * 
 * �������:
 * ����ɸ����ַ�C�����������Ρ�����ע�⵽�м����м�������Ϊ���ý������ȥ���������Σ����������
 * ����ʵ������������50%����������ȡ������
 * 
 * ��������:
 * 10 a
 * 
 * �������:
 * aaaaaaaaaa
 * a        a
 * a        a
 * a        a
 * aaaaaaaaaa
 */
public class �Ͱ°���һ���� {
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int length = read.nextInt();
        String c = read.next();
        long width = Math.round(length * 0.5);
        for(int i = 0; i < length; i++) {
            System.out.print(c);
        }
        System.out.println();
        for(int i = 1; i < width - 1; i++) {
            for(int j = 0; j < length; j++) {
                if(j == 0 || j == length - 1) {
                    System.out.print(c);
                } else {
                    System.out.print(" ");
                }
                    
            }
            System.out.println();
        }
        for(int i = 0; i < length; i++) {
            System.out.print(c);
        }
    }
}

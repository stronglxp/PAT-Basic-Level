package com.codeliu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author liu
 * @version ����ʱ�䣺2018��3��21�� ����11:38:22
 * ��Ŀ����
 * ������ǹ����������ԣ����֪��ħ�����������Լ��Ļ���ϵͳ ���� ���纣����߹����ģ�
 * ��ʮ�߸�������(Sickle)��һ����¡(Galleon)����ʮ�Ÿ�����(Knut)��һ�����ɣ������ס������ڣ�
 * ��������Ӧ���ļ�ǮP����ʵ����ǮA�����������дһ��������������Ӧ�ñ��ҵ���Ǯ��
 * 
 * ��������
 * ������1���зֱ����P��A����ʽΪ��Galleon.Sickle.Knut���������1���ո�ָ���
 * ����Galleon��[0, 10^7]]�����ڵ�������Sickle��[0, 17)�����ڵ�������Knut��[0, 29)�����ڵ�������
 * 
 * �������
 * ��һ������������ͬ���ĸ�ʽ�������Ӧ�ñ��ҵ���Ǯ�������û����Ǯ����ô�����Ӧ���Ǹ�����
 * 
 * ����ʾ��
 * 10.16.27 14.1.28
 * 
 * ������
 * 3.2.1
 */
public class �ڻ����ִ�����Ǯ {
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String p = read.next();
        String a = read.next();
        // Ӧ����
        String[] p1 = p.split("\\.");
        // ���ϴ���
        String[] a1 = a.split("\\.");
        int[] p2 = new int[3];
        int[] a2 = new int[3];
        for(int i = 0; i < 3; i++) {
            p2[i] = Integer.parseInt(p1[i]);
            a2[i] = Integer.parseInt(a1[i]);
        }
        
        if(a2[0] > p2[0]) {
            counts(a2, p2, true);
        } else {
            counts(p2, a2, false);
        }
    }
    
    static void counts(int[] a2, int[] p2, boolean flag) {
        int a = a2[0];
        int b = a2[1];
        int c = a2[2] - p2[2];
        if(c < 0) {
            c += 29;
            b -= 1;
        } 
        b -= p2[1];
        if(b < 0) {
            b += 17;
            a -= 1;
        }
        a -= p2[0];
        if(!flag) {
            System.out.print("-");
        }
        System.out.print(a + "." + b + "." + c);
    }
}

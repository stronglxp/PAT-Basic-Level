package com.codeliu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author liu
 * @version ����ʱ�䣺2018��3��19�� ����7:33:23
 * ��Ŀ����
 * ����һ�����������У���������p������������е����ֵ��M����Сֵ��m�����M <= m * p���������������������С�
 * ���ڸ�������p��һЩ���������������ѡ�񾡿��ܶ��������һ���������С�
 * 
 * ��������
 * �����һ�и�������������N��p������N��<= 10^5����������������ĸ�����p��<= 10^9���Ǹ����Ĳ�����
 * �ڶ��и���N����������ÿ����������10^9��
 * 
 * �������
 * ��һ�������������ѡ����ٸ����������������һ���������С�
 * 
 * ����ʾ��
 * 10 8
 * 2 3 20 4 5 1 6 7 8 9
 * 
 * ������
 * 8
 */
public class �������� {
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int p = read.nextInt();
        int[] result = new int[n];
        for(int i = 0; i < n; i++) {
            result[i] = read.nextInt();
        }
        Arrays.sort(result);
        int len1 = 0;
        int len2 = 0;
        int i = 0, j = result.length - 1;
        while(result[i] * p < result[j]) {
            i++;
        } 
        len1 = result.length - i;
        i = 0;
        while(result[i] * p < result[j]) {
            j--;
        }
        len2 = j + 1;
        int max = len1 > len2 ? len1 : len2;
        System.out.println(max);
    }
}

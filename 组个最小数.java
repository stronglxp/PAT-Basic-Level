package com.codeliu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author liu
 * @version ����ʱ�䣺2018��3��16�� ����4:49:27
 * ��Ŀ����
 * ��������0-9�����ɸ��������������˳��������Щ���֣�������ȫ��ʹ�á�
 * Ŀ����ʹ�����õ�����������С��ע��0��������λ�������磺��������0������1������5��һ��8�����ǵõ�����С��������10015558��
 * �ָ������֣����д��������ܹ���ɵ���С������
 * 
 * ��������
 * ÿ���������1������������ÿ������������һ���и���10���Ǹ�������˳���ʾ����ӵ������0������1����������9�ĸ�����
 * ��������һ���ո�ָ���10�����ֵ��ܸ���������50��������ӵ��1����0�����֡�
 * 
 * �������
 * ��һ��������ܹ���ɵ���С������
 * 
 * ��������
 * 2 2 0 0 0 3 0 0 1 0
 * 
 * ������
 * 10015558
 */
public class �����С�� {
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] r = new int[10];
        int count = 0;
        int sum = 0;
        for(int i = 0; i < 10; i++) {
            r[i] = read.nextInt();
            sum += r[i];
        }
        int[] result = new int[sum];
        for(int i = 0; i < 10; i++) {
            if(r[i] != 0) {
                for(int j = 0; j < r[i]; j++) {
                    result[count] = i;
                    count++;
                } 
            }
        }
        count = 0;
        // ����
        Arrays.sort(result);
        while(result[count] == 0) {
            count++;
        }
        System.out.print(result[count]);
        for(int i = 0; i < count; i++) {
            System.out.print(result[i]);
        }
        for(int i = count + 1; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }
}

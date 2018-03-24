package com.codeliu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author liu
 * @version ����ʱ�䣺2018��3��24�� ����12:14:45
 * ��Ŀ����
 * ����ά���ٿƵĶ��壺���������ǵ����㷨����һ����������ݣ��𲽲��������������С�ÿ�������У�
 * �㷨������������ȡ��һԪ�أ���֮����������������ȷ��λ�á���˵���ֱ��ȫ��Ԫ������
 * �鲢����������µ������������Ƚ�ԭʼ���п���N��ֻ����1��Ԫ�ص����������У�Ȼ��ÿ�ε����鲢�������ڵ����������У�
 * ֱ�����ֻʣ��1����������С��ָ���ԭʼ���к���ĳ�����㷨�������м����У������жϸ��㷨���������������㷨��
 * 
 * ��������
 * �����ڵ�һ�и���������N (<=100)�����һ�и���ԭʼ���е�N�����������һ�и�����ĳ�����㷨�������м����С�
 * ������������Ŀ���������������ּ��Կո�ָ���
 * 
 * �������
 * �����ڵ�1���������Insertion Sort����ʾ�������򡢻�Merge Sort����ʾ�鲢����Ȼ���ڵ�2�������
 * �ø������㷨�ٵ���һ�ֵĽ�����С���Ŀ��֤ÿ����ԵĽ����Ψһ�ġ����ּ��Կո�ָ�������ĩ�����ж���ո�
 * 
 * ����ʾ��
 * 10
 * 3 1 2 8 7 5 9 4 6 0
 * 1 2 3 7 8 5 9 4 6 0
 * 
 * ������
 * Insertion Sort
 * 1 2 3 5 7 8 9 4 6 0
 */
public class ������鲢 {
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] before = new int[n];
        int[] after = new int[n];
        for(int i = 0; i < n; i++) {
            before[i] = read.nextInt();
        }
        for(int i = 0; i < n; i++) {
            after[i] = read.nextInt();
        }
        int index = 0;
        String flag = "Insertion Sort";
        for(int i = 0; i < n; i++) {
            if(after[i] > after[i + 1]) {
                // ��i��ʼ��û������
                index = i + 1;
                break;
            }
        }
        for(int i = index; i < n; i++) {
            if(before[i] != after[i]) {
                flag = "Merge Sort";
            }
        }
        // ����ǲ�����������һ�εĽ��
        if(flag.equals("Insertion Sort")) {
            for(int i = index; i > 0; i--) {
                if(after[i] < after[i - 1]) {
                    int temp = after[i];
                    after[i] = after[i - 1];
                    after[i - 1] = temp;
                }
            }
        } else {
            index = 2 * index;
            for(int i = 0; i < n; i += index) {
                int count = (i + index > n) ? n : i + index;
                Arrays.sort(after, i, count);
            }
        }
        System.out.println(flag);
        for(int i = 0; i < n; i++) {
            if(i == n - 1) {
                System.out.print(after[i]);
                break;
            }
            System.out.print(after[i] + " ");
        }
    }
}

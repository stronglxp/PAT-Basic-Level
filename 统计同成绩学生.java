package com.codeliu;

import java.util.Scanner;

/**
 * @author liu
 * @version ����ʱ�䣺2018��3��20�� ����7:28:03
 * ��Ŀ����
 * ����Ҫ�����N��ѧ���ĳɼ��������ĳһ����������ѧ�����������
 * 
 * ��������
 * �����ڵ�1�и���������10^5��������N����ѧ�������������1�и���N��ѧ���İٷ��������ɼ����м��Կո�ָ���
 * ���1�и���Ҫ��ѯ�ķ�������K��������N�����������������K���������м��Կո�ָ���
 * 
 * �������
 * ��һ���а���ѯ˳������÷ֵ���ָ��������ѧ���������м��Կո�ָ�������ĩ�����ж���ո�
 * 
 * ����ʾ��
 * 10
 * 60 75 90 55 75 99 82 90 75 50
 * 3 75 90 88
 * 
 * ������
 * 3 2 0
 */
public class ͳ��ͬ�ɼ�ѧ�� {
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] score = new int[n];
        for(int i = 0; i < n; i++) {
            score[i] = read.nextInt();
        }
        int findNum = read.nextInt();
        int[] findScore = new int[findNum];
        int[] counts = new int[findNum];
        for(int i = 0; i < findNum; i++) {
            findScore[i] = read.nextInt();
            counts[i] = 0;
        }
        for(int i = 0; i < findNum; i++) {
            for(int j = 0; j < n; j++) {
                if(score[j] == findScore[i]) {
                    counts[i]++;
                }
            }
        }
        for(int i = 0; i < findNum; i++) {
            if(i == findNum - 1) {
                System.out.print(counts[i]);
            } else {
                System.out.print(counts[i] + " ");
            }
        }
    }
}

package com.codeliu;

import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author liu
 * @version ����ʱ�䣺2018��3��20�� ����2:19:24
 * ��Ŀ����
 * Ϊ������ʵ˵���ھ�����������ļ�ǿ��PAT��֯��һ���ھ�����ܴ�������������ݱ������ͳ�Ƴ�������ǿ���Ǹ�ѧУ��
 * 
 * ��������
 * �����ڵ�1�и���������10^5��������N�����������������N�У�ÿ�и���һλ�����ߵ���Ϣ�ͳɼ���
 * �������������ѧУ�ı�ţ���1��ʼ������ţ�����������ɼ����ٷ��ƣ����м��Կո�ָ���
 * 
 * �������
 * ��һ���и����ܵ÷���ߵ�ѧУ�ı�š������ܷ֣��м��Կո�ָ�����Ŀ��֤��Ψһ��û�в��С�
 * 
 * ����ʾ��
 * 6
 * 3 65
 * 2 80
 * 1 100
 * 2 70
 * 3 40
 * 3 0
 * 
 * ������
 * 2 150
 */
public class �ھ����ļ�ǿ {
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        TreeMap<Integer, Integer> result = new TreeMap<Integer, Integer>();
        for(int i = 0; i < n; i++) {
            int id = read.nextInt();
            int score = read.nextInt();
            if(result.containsKey(id)) {
                result.put(id, result.get(id) + score);
            } else {
                result.put(id, score);
            }
        }
        int max = 0;
        int flag = 1;
        for(int i = result.firstKey(); i <= result.lastKey(); i++) {
            if(result.containsKey(i)) {
                if(result.get(i) > max) {
                    max = result.get(i);
                    flag = i;
                }
            }
        }
        System.out.println(flag + " " + max);
    }
}

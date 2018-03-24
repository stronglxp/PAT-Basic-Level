package com.codeliu;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author liu
 * @version ����ʱ�䣺2018��3��17�� ����10:48:44
 * ��Ŀ����
 * ����һ��kλ����N = dk-1*10k-1 + ... + d1*101 + d0 (0<=di<=9, i=0,...,k-1, dk-1>0)��
 * ���д����ͳ��ÿ�ֲ�ͬ�ĸ�λ���ֳ��ֵĴ��������磺����N = 100311������2��0��3��1����1��3��
 * 
 * ��������
 * ÿ���������1��������������һ��������1000λ��������N��
 * 
 * �������
 * ��N��ÿһ�ֲ�ͬ�ĸ�λ���֣���D:M�ĸ�ʽ��һ���������λ����D������N�г��ֵĴ���M��Ҫ��D�����������
 * 
 * ��������
 * 100311
 * 
 * ������
 * 0:2
 * 1:3
 * 3:1
 */
public class ��λ��ͳ�� {
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String N = read.next();
        char[] r = N.toCharArray();
        Map<Integer, Integer> result = new TreeMap<Integer, Integer>();
        for(int i = 0; i < r.length; i++) {
            if(result.containsKey(r[i] - '0')) {
                result.put(r[i] - '0', result.get(r[i] - '0') + 1);
            } else {
                result.put(r[i] - '0', 1);
            }
        }
        for(int i:result.keySet()) {
            System.out.println(i + ":" + result.get(i));
        }
    }
}

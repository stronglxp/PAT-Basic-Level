package com.codeliu;

import java.util.Scanner;

/**
 * @author liu
 * @version ����ʱ�䣺2018��3��24�� ����2:33:23
 * ��Ŀ����
 * Ҫ���һ��C���Գ��������ʱ�䣬���õķ����ǵ���ͷ�ļ�time.h�������ṩ��clock()������
 * ���Բ�׽�ӳ���ʼ���е�clock()������ʱ���ķѵ�ʱ�䡣���ʱ�䵥λ��clock tick������ʱ�Ӵ�㡱��
 * ͬʱ����һ������CLK_TCK�������˻���ʱ��ÿ�����ߵ�ʱ�Ӵ����������Ϊ�˻��һ������f������ʱ�䣬
 * ����ֻҪ�ڵ���f֮ǰ�ȵ���clock()�����һ��ʱ�Ӵ����C1����fִ����ɺ��ٵ���clock()�������һ��ʱ�Ӵ��
 * ��C2�����λ�õ�ʱ�Ӵ����֮��(C2-C1)����f���������ĵ�ʱ�Ӵ�������ٳ��Գ���CLK_TCK�����ﲻ���򵥼��賣��CLK_TCKΪ100��
 * �ָ������⺯��ǰ�����λ�õ�ʱ�Ӵ����������������⺯�����е�ʱ�䡣
 * �͵õ�������Ϊ��λ������ʱ�䡣
 * 
 * ��������
 * ������һ����˳�����2������C1��C1��ע�����λ�õ�ʱ�Ӵ�����϶�����ͬ����C1 < C2������ȡֵ��[0, 10^7]
 * 
 * �������
 * ��һ����������⺯�����е�ʱ�䡣����ʱ����밴�ա�hh:mm:ss������2λ�ġ�ʱ:��:�롱����ʽ���������1���ʱ���������뵽�롣
 * 
 * ����ʾ��
 * 123 4577973
 * 
 * ������
 * 12:42:59
 */
public class ��������ʱ�� {
	 public static void main(String[] args) {
	        Scanner read = new Scanner(System.in);
	        int c1 = read.nextInt();
	        int c2 = read.nextInt();
	        int sum = (c2 - c1) / 100;
	        int h = sum / 3600;
	        sum = sum % 3600;
	        int m = sum / 60;
	        int s = sum % 60;
	        if(h < 10) {
	            System.out.print("0" + h + ":");
	        } else {
	            System.out.print(h + ":");
	        }
	        if(m < 10) {
	            System.out.print("0" + m + ":");
	        } else {
	            System.out.print(m + ":");
	        }
	        if(s < 10) {
	            System.out.print("0" + s);
	        } else {
	            System.out.print(s);
	        }
	    }
}

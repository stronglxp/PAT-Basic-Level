package com.codeliu;

import java.util.*;
/**
 * @author liu
 * @version ����ʱ�䣺2018��3��17�� ����4:14:24
 * ����map�е�key����ᶪʧ��Ϣ���������ֵ������
 * ��Ŀ����
 * �±����й���������ѽ�ʱ�Ե�һ�ִ�ͳʳƷ����ͬ��������಻ͬ��ζ���±���
 * �ָ������������±��Ŀ���������ۼۡ��Լ��г�����������������������Ի�õ���������Ƕ��١�
 * ע�⣺����ʱ����ȡ��һ���ֿ�档���������������������ģ�����������3���±����������ֱ�Ϊ18��15��10��֣�
 * ���ۼ۷ֱ�Ϊ75��72��45��Ԫ������г������������ֻ��20��֣���ô��������������Ӧ��������ȫ��15��ֵ�2���±���
 * �Լ�5��ֵ�3���±������72 + 45/2 = 94.5����Ԫ����
 * 
 * ��������
 * ÿ���������1������������ÿ�����������ȸ���һ��������1000��������N��ʾ�±�����������
 * �Լ�������500�������Ϊ��λ����������D��ʾ�г���������������һ�и���N��������ʾÿ���±��Ŀ�����������Ϊ��λ����
 * ���һ�и���N��������ʾÿ���±������ۼۣ�����ԪΪ��λ�������ּ��Կո�ָ���
 * 
 * �������
 * ��ÿ�������������һ�������������棬����ԪΪ��λ����ȷ��С�����2λ��
 * 
 * ����ʾ��
 * 3 20
 * 18 15 10
 * 75 72 45
 * 
 * ������
 * 94.50
 */
public class �±� {  
	public static void main(String[] args) {
        /*Scanner read = new Scanner(System.in);
        int N = read.nextInt();
        int D = read.nextInt();
        int[] a1 = new int[N];
        int[] a2 = new int[N];
        // �Զ���������
        TreeMap<Double, Integer> result = new TreeMap<Double, Integer>();
        double sum = 0;
        for(int i = 0; i < N; i++) {
            a1[i] = read.nextInt();
        }
        for(int i = 0; i < N; i++) {
            a2[i] = read.nextInt();
            result.put((double)a2[i] / (double)a1[i], i);   
        }
        System.out.println(result);
        for(int i = 0; i < N; i++) {
            if(D >= a1[result.get(result.lastKey())]) {
                D -= a1[result.get(result.lastKey())];
                sum += a2[result.get(result.lastKey())];
                result.pollLastEntry();
            } else{
                sum += (D * 1.0) * result.lastKey();
                break;
            }
        }
        System.out.printf("%.2f\n", sum);
	}*/
		Scanner read = new Scanner(System.in);
        int N = read.nextInt();
        int D = read.nextInt();
        double[] a1 = new double[N];
        double[] a2 = new double[N];
        double[] price = new double[N];
        
        double sum = 0;
        for(int i = 0; i < N; i++) {
            a1[i] = read.nextDouble();
        }
        for(int i = 0; i < N; i++) {
            a2[i] = read.nextDouble();
            price[i] = a2[i] / a1[i];
        }
        // �����۴Ӹߵ�������
        sort(a1, a2, price);
        for(int i = 0; i < N; i++) {
            if(D >= a1[i]) {
                D -= a1[i];
                sum += a2[i];
            } else{
                sum += (D * 1.0) * price[i];
                break;
            }
        }
        System.out.printf("%.2f\n", sum);
    }
    private static void sort(double[] a1, double[] a2, double[] price) {
        for(int i = 0; i < price.length; i++) {
            for(int j = 0; j < price.length - i - 1; j++) {
                if(price[j] < price[j + 1]) {
                    double temp = price[j];
                    price[j] = price[j + 1];
                    price[j + 1] = temp;
                    temp = a1[j];
                    a1[j] = a1[j + 1];
                    a1[j + 1] = temp;
                    temp = a2[j];
                    a2[j] = a2[j + 1];
                    a2[j + 1] = temp;
                }
            }
        }
    }
}

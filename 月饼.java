package com.codeliu;

import java.util.*;
/**
 * @author liu
 * @version 创建时间：2018年3月17日 下午4:14:24
 * 利用map中的key排序会丢失信息？比如两种单价相等
 * 题目描述
 * 月饼是中国人在中秋佳节时吃的一种传统食品，不同地区有许多不同风味的月饼。
 * 现给定所有种类月饼的库存量、总售价、以及市场的最大需求量，请你计算可以获得的最大收益是多少。
 * 注意：销售时允许取出一部分库存。样例给出的情形是这样的：假如我们有3种月饼，其库存量分别为18、15、10万吨，
 * 总售价分别为75、72、45亿元。如果市场的最大需求量只有20万吨，那么我们最大收益策略应该是卖出全部15万吨第2种月饼、
 * 以及5万吨第3种月饼，获得72 + 45/2 = 94.5（亿元）。
 * 
 * 输入描述
 * 每个输入包含1个测试用例。每个测试用例先给出一个不超过1000的正整数N表示月饼的种类数、
 * 以及不超过500（以万吨为单位）的正整数D表示市场最大需求量。随后一行给出N个正数表示每种月饼的库存量（以万吨为单位）；
 * 最后一行给出N个正数表示每种月饼的总售价（以亿元为单位）。数字间以空格分隔。
 * 
 * 输出描述
 * 对每组测试用例，在一行中输出最大收益，以亿元为单位并精确到小数点后2位。
 * 
 * 输入示例
 * 3 20
 * 18 15 10
 * 75 72 45
 * 
 * 输出结果
 * 94.50
 */
public class 月饼 {  
	public static void main(String[] args) {
        /*Scanner read = new Scanner(System.in);
        int N = read.nextInt();
        int D = read.nextInt();
        int[] a1 = new int[N];
        int[] a2 = new int[N];
        // 自动排序，升序
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
        // 按单价从高到低排序
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

package com.codeliu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author liu
 * @version 创建时间：2018年3月24日 下午12:14:45
 * 题目描述
 * 根据维基百科的定义：插入排序是迭代算法，逐一获得输入数据，逐步产生有序的输出序列。每步迭代中，
 * 算法从输入序列中取出一元素，将之插入有序序列中正确的位置。如此迭代直到全部元素有序。
 * 归并排序进行如下迭代操作：首先将原始序列看成N个只包含1个元素的有序子序列，然后每次迭代归并两个相邻的有序子序列，
 * 直到最后只剩下1个有序的序列。现给定原始序列和由某排序算法产生的中间序列，请你判断该算法究竟是哪种排序算法？
 * 
 * 输入描述
 * 输入在第一行给出正整数N (<=100)；随后一行给出原始序列的N个整数；最后一行给出由某排序算法产生的中间序列。
 * 这里假设排序的目标序列是升序。数字间以空格分隔。
 * 
 * 输出描述
 * 首先在第1行中输出“Insertion Sort”表示插入排序、或“Merge Sort”表示归并排序；然后在第2行中输出
 * 用该排序算法再迭代一轮的结果序列。题目保证每组测试的结果是唯一的。数字间以空格分隔，且行末不得有多余空格。
 * 
 * 输入示例
 * 10
 * 3 1 2 8 7 5 9 4 6 0
 * 1 2 3 7 8 5 9 4 6 0
 * 
 * 输出结果
 * Insertion Sort
 * 1 2 3 5 7 8 9 4 6 0
 */
public class 插入与归并 {
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
                // 从i开始就没有排序
                index = i + 1;
                break;
            }
        }
        for(int i = index; i < n; i++) {
            if(before[i] != after[i]) {
                flag = "Merge Sort";
            }
        }
        // 如果是插入排序，求下一次的结果
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

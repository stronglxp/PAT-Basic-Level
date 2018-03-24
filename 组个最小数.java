package com.codeliu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author liu
 * @version 创建时间：2018年3月16日 下午4:49:27
 * 题目描述
 * 给定数字0-9各若干个。你可以以任意顺序排列这些数字，但必须全部使用。
 * 目标是使得最后得到的数尽可能小（注意0不能做首位）。例如：给定两个0，两个1，三个5，一个8，我们得到的最小的数就是10015558。
 * 现给定数字，请编写程序输出能够组成的最小的数。
 * 
 * 输入描述
 * 每个输入包含1个测试用例。每个测试用例在一行中给出10个非负整数，顺序表示我们拥有数字0、数字1、……数字9的个数。
 * 整数间用一个空格分隔。10个数字的总个数不超过50，且至少拥有1个非0的数字。
 * 
 * 输出描述
 * 在一行中输出能够组成的最小的数。
 * 
 * 输入例子
 * 2 2 0 0 0 3 0 0 1 0
 * 
 * 输出结果
 * 10015558
 */
public class 组个最小数 {
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
        // 升序
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

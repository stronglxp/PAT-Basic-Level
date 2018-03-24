package com.codeliu;

import java.util.Scanner;

/**
 * @author liu
 * @version 创建时间：2018年3月24日 下午1:06:27
 * 题目描述
 * 令Pi表示第i个素数。现任给两个正整数M <= N <= 10000，请输出PM到PN的所有素数。
 * 
 * 输入描述
 * 输入在一行中给出M和N，其间以空格分隔。
 * 
 * 输出描述
 * 输出从PM到PN的所有素数，每10个数字占1行，其间以空格分隔，但行末不得有多余空格。
 * 
 * 输入示例
 * 5 27
 * 
 * 输出结果
 * 11 13 17 19 23 29 31 37 41 43
 * 47 53 59 61 67 71 73 79 83 89
 * 97 101 103
 */
public class 数素数 {
	public static void main(String[] args) {
        Scanner in=new Scanner(System.in); 
        int m=in.nextInt();
        int n=in.nextInt();
        calcuteprimeNumber(m,n);
    }
    private static void calcuteprimeNumber(int m, int n) {
        int length=110000;
        boolean [] prime=new boolean[length+1];
        for (int i = 2; i < prime.length; i++) {
            if(i%2==0){
                prime[i]=false;
            }else{
                prime[i]=true;
            }
        }
        for (int i = 3; i <= Math.sqrt(length+1); i+=2) {
            for(int j=i+i;j<length+1;j+=i){
                prime[j]=false;
            }
        }
        prime[2]=true;
        int count=0;
        for (int i = 2; i < prime.length; i++) {
            if(prime[i]){
                count++;
                if(count>=m&&count<=n){
                    System.out.print(i);
                    if((count-m+1)%10==0){
                        System.out.println();
                    }else{
                        if(count<n){
                            System.out.print(" ");
                        } 
                    }
                }else if(count>n){
                    break;
                }
            }
        }
    }
}

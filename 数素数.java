package com.codeliu;

import java.util.Scanner;

/**
 * @author liu
 * @version ����ʱ�䣺2018��3��24�� ����1:06:27
 * ��Ŀ����
 * ��Pi��ʾ��i�����������θ�����������M <= N <= 10000�������PM��PN������������
 * 
 * ��������
 * ������һ���и���M��N������Կո�ָ���
 * 
 * �������
 * �����PM��PN������������ÿ10������ռ1�У�����Կո�ָ�������ĩ�����ж���ո�
 * 
 * ����ʾ��
 * 5 27
 * 
 * ������
 * 11 13 17 19 23 29 31 37 41 43
 * 47 53 59 61 67 71 73 79 83 89
 * 97 101 103
 */
public class ������ {
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

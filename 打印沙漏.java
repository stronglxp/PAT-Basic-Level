package com.codeliu;

import java.util.Scanner;

/**
 * @author liu
 * @version ����ʱ�䣺2018��3��18�� ����3:37:27
 * ��˵��
 */
public class ��ӡɳ© {
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        String image = read.next();
        if(n == 1) {
        	System.out.println(image);
        	System.out.println(n);
        } else {
        	int m = Math.round(n / 2);
            System.out.println(m);
            int floor = (int)Math.sqrt(m);
            System.out.println(floor);
            int count = 0;
        	for(int i = floor; i > 0; i--) {
                for(int k = 0; k < floor - i; k++) {
                    System.out.print(" ");
                }
                for(int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(image);
                    count++;
                }
                System.out.println();
            }
            for(int i = 2; i <= floor; i++) {
                for(int k = 0; k < floor - i; k++) {
                    System.out.print(" ");
                }
                for(int j = 0 ;j < 2 * i - 1; j++) {
                    System.out.print(image);
                    count++;
                }
                System.out.println();
            }
            System.out.println(n - count);
        }
    }
}

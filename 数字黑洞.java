package com.codeliu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author liu
 * @version 创建时间：2018年3月16日 上午9:14:25
 * 类说明
 */
public class 数字黑洞 {
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String s = read.next();
        if(cal(s)[2] == 0) {
            System.out.println(cal(s)[0] + " - " + cal(s)[1] + " = 0000");
        } else {
        	while(cal(s)[2] != 6174) {
            	System.out.printf("%04d - %04d = %04d\n", cal(s)[0], cal(s)[1], cal(s)[2]);
                s = cal(s)[2] + "";
            }
            System.out.printf("%04d - %04d = %04d\n", cal(s)[0], cal(s)[1], cal(s)[2]);
        }
    }
    
    private static int[] cal(String s) {
        while(s.length() < 4) {
            s = "0" + s;
        }
        int[] x = new int[4];
        for(int i = 0; i < 4; i++) {
            x[i] = s.charAt(i) - '0';
        }
        // 升序
        Arrays.sort(x);
        int n1 = x[0] * 1000 + x[1] * 100 + x[2] * 10 + x[3];
        int n2 = x[3] * 1000 + x[2] * 100 + x[1] * 10 + x[0];
        int[] k = {n2, n1, n2 - n1};
        return k;
    }
}

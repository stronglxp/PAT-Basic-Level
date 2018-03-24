package com.codeliu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author liu
 * @version 创建时间：2018年3月12日 下午8:17:30
 * 类说明
 */
public class 锤子剪刀布 {
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int N = read.nextInt();
        String[][] result = new String[N][2];
        HashMap<String, Integer> ss1 = new HashMap<String, Integer>();
        HashMap<String, Integer> ss2 = new HashMap<String, Integer>();
        int a = 0, b = 0, c = 0;
        for(int i = 0; i < N; i++) {
            result[i][0] = read.next();
            result[i][1] = read.next();
        }
        for(int i = 0; i < N; i++) {
            if(result[i][0].equals(result[i][1])) {
            	b++;
            } else if((result[i][0].equals("C") && result[i][1].equals("J")) || (result[i][0].equals("J") && 
            		result[i][1].equals("B")) || (result[i][0].equals("B") && result[i][1].equals("C"))) {
            	a++;
            	if(ss1.containsKey(result[i][0])) {
                    ss1.put(result[i][0],ss1.get(result[i][0]) + 1);
                } else {
                    ss1.put(result[i][0],1);
                }
            } else {
            	c++;
            	if(ss2.containsKey(result[i][1])) {
                    ss2.put(result[i][1],ss1.get(result[i][1]) + 1);
                } else {
                    ss2.put(result[i][1],1);
                }
            }
        }
        int max1 = 0, max2 = 0;
        String x1 = "B", x2 = "B";
        if(ss1.get("J") != null) {
        	max1 = ss1.get("J");
        	x1 = "J";
        }
        if(ss1.get("C") != null && ss1.get("C") >= max1) {
        	max1 = ss1.get("C");
        	x1 = "C";
        }
        if(ss1.get("B") != null && ss1.get("B") >= max1) {
        	max1 = ss1.get("B"); 
        	x1 = "B";
        }
        
        if(ss2.get("J") != null) {
        	max2 = ss2.get("J");
        	x2 = "J";
        }
        if(ss2.get("C") != null && ss2.get("C") >= max2) {
        	max2 = ss2.get("C");
        	x2 = "C";
        }
        if(ss2.get("B") != null && ss2.get("B") >= max2) {
        	max2 = ss2.get("B");
        	x2 = "B";
        }
        System.out.println(a + " " + b + " " + c);
        System.out.println(c + " " + b + " " + a);
        System.out.println(x1 + " " + x2);
    }
}

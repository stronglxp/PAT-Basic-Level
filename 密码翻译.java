package com.codeliu;

import java.util.Scanner;

/**
 * @author liu
 * @version 创建时间：2018年3月17日 下午9:50:01
 * 类说明
 */
public class 密码翻译 {
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String s = read.nextLine();
        StringBuffer r = new StringBuffer();
        char[] ss = s.toCharArray();
        System.out.println(ss);
        for(int i = 0; i < ss.length; i++) {
            if((ss[i] >= 'a' && ss[i] < 'z') || (ss[i] >= 'A' && ss[i] < 'Z')) {
                r.append((char)(ss[i] + 1)); 
            } else if(ss[i] == 'z') {
                r.append('a');
            } else if(ss[i] == 'Z') {
                r.append('A');
            } else {
                r.append(ss[i]);
            }
        }
        System.out.println(r.toString());
    }
}

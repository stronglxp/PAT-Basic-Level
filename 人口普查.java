package com.codeliu;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author liu
 * @version 创建时间：2018年3月19日 上午12:48:51
 * 题目描述
 * 某城镇进行人口普查，得到了全体居民的生日。现请你写个程序，找出镇上最年长和最年轻的人。
 * 这里确保每个输入的日期都是合法的，但不一定是合理的——假设已知镇上没有超过200岁的老人，而今天是2014年9月6日，
 * 所以超过200岁的生日和未出生的生日都是不合理的，应该被过滤掉。
 * 
 * 输入描述
 * 输入在第一行给出正整数N，取值在(0, 10^5]；随后N行，每行给出1个人的姓名（由不超过5个英文字母组成的字符串）、以及
 * 按“yyyy/mm/dd”（即年/月/日）格式给出的生日。题目保证最年长和最年轻的人没有并列。
 * 
 * 输出描述
 * 在一行中顺序输出有效生日的个数、最年长人和最年轻人的姓名，其间以空格分隔。
 * 
 * 输入示例
 * 5
 * John 2001/05/12
 * Tom 1814/09/06
 * Ann 2121/01/30
 * James 1814/09/05
 * Steve 1967/11/20
 * 
 * 输出结果
 * 3 Tom John
 */
public class 人口普查 {
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        String[][] birds = new String[n][];
        HashMap<Integer, Person> p = new HashMap<Integer, Person>();
        for(int i = 0; i < n; i++) {
            p.put(i, new Person(read.next(), read.next()));
            birds[i] = p.get(i).bir.split("/");
        }
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(Integer.parseInt(birds[i][0]) > 1814 && Integer.parseInt(birds[i][0]) < 2014) {
                count++;
            } else if(Integer.parseInt(birds[i][0]) == 1814 || Integer.parseInt(birds[i][0]) == 2014) {
                if(Integer.parseInt(birds[i][1]) >= 9) {
                    if(Integer.parseInt(birds[i][2]) >= 6) {
                        count++;
                    } else {
                    	p.remove(i);
                    }
                } else {
                	p.remove(i);
                }
            } else {
                p.remove(i);
            }
        }
        //System.out.println(p);
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;
        int min1 = 2020;
        int min2 = 13;
        int min3 = 40;
        String max = "";
        String min = "";
        for(int i:p.keySet()) {
        	//birds[i] = p.get(i).bir.split("/");
            if((Integer.parseInt(birds[i][0]) > max1) || 
               (Integer.parseInt(birds[i][0]) == max1 && Integer.parseInt(birds[i][1]) > max2) ||
              (Integer.parseInt(birds[i][0]) == max1 && Integer.parseInt(birds[i][1]) == max2 && Integer.parseInt(birds[i][2]) > max3)) {
                max1 = Integer.parseInt(birds[i][0]);
                max2 = Integer.parseInt(birds[i][1]);
                max3 = Integer.parseInt(birds[i][2]);
                min = p.get(i).name;
                //continue;
            }
            if((Integer.parseInt(birds[i][0]) < min1) || 
               (Integer.parseInt(birds[i][0]) == min1 && Integer.parseInt(birds[i][1]) < min2) ||
              (Integer.parseInt(birds[i][0]) == min1 && Integer.parseInt(birds[i][1]) == min2 && Integer.parseInt(birds[i][2]) < min3)) {
                min1 = Integer.parseInt(birds[i][0]);
                min2 = Integer.parseInt(birds[i][1]);
                min3 = Integer.parseInt(birds[i][2]);
                max = p.get(i).name;
                //continue;
            }
        }
        System.out.print(count + " " + max + " " + min);
    }
    static class Person {
        String name;
        String bir;
        public Person(String name, String bir) {
            this.name = name;
            this.bir = bir;
        }
        public String toString() {
        	return name + "->" + bir;
        }
    }
}

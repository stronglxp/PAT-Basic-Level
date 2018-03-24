package com.codeliu;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author liu
 * @version ����ʱ�䣺2018��3��19�� ����12:48:51
 * ��Ŀ����
 * ĳ��������˿��ղ飬�õ���ȫ���������ա�������д�������ҳ��������곤����������ˡ�
 * ����ȷ��ÿ����������ڶ��ǺϷ��ģ�����һ���Ǻ���ġ���������֪����û�г���200������ˣ���������2014��9��6�գ�
 * ���Գ���200������պ�δ���������ն��ǲ�����ģ�Ӧ�ñ����˵���
 * 
 * ��������
 * �����ڵ�һ�и���������N��ȡֵ��(0, 10^5]�����N�У�ÿ�и���1���˵��������ɲ�����5��Ӣ����ĸ��ɵ��ַ��������Լ�
 * ����yyyy/mm/dd��������/��/�գ���ʽ���������ա���Ŀ��֤���곤�����������û�в��С�
 * 
 * �������
 * ��һ����˳�������Ч���յĸ��������곤�˺��������˵�����������Կո�ָ���
 * 
 * ����ʾ��
 * 5
 * John 2001/05/12
 * Tom 1814/09/06
 * Ann 2121/01/30
 * James 1814/09/05
 * Steve 1967/11/20
 * 
 * ������
 * 3 Tom John
 */
public class �˿��ղ� {
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

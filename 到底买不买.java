package com.codeliu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author liu
 * @version ����ʱ�䣺2018��3��20�� ����8:00:35
 * ��Ŀ����
 * С������Щ������һ���Լ�ϲ�����鴮�������ӵ�̯���кܶമ������ɫ���鴮�����ǲ��ϰ��κ�һ����ɢ������
 * ����С��Ҫ���æ�ж�һ�£�ĳ���������Ƿ������ȫ���Լ���Ҫ�����ӣ�����ǣ���ô�������ж��ٶ�������ӣ�
 * ������ǣ���ô������ȱ�˶������ӡ�Ϊ���������������[0-9]��[a-z]��[A-Z]��Χ�ڵ��ַ�����ʾ��ɫ�����磬
 * YrR8RrY��С���������鴮����ôppRYYGrrYBR2258��������Ϊ������ȫ������Ҫ�����ӣ�������8�Ų���Ҫ�����ӣ�
 * ppRYYGrrYB225��������Ϊû�к�ɫ���ӣ���������һ�ź�ɫ�����ӡ�
 * 
 * ��������
 * ÿ���������1������������ÿ�����������ֱ���2�����Ⱥ����̯�����鴮��С���������鴮��������������1000�����ӡ�
 * 
 * �������
 * �������������һ���������Yes���Լ��ж��ٶ�������ӣ����������������һ���������No���Լ�ȱ�˶������ӡ�
 * �����1���ո�ָ���
 * 
 * ����ʾ��
 * ppRYYGrrYBR2258
 * YrR8RrY
 * 
 * ������
 * Yes 8
 */
public class �������� {
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String s1 = read.next();
        String s2 = read.next();
        ArrayList<Character> a1 = new ArrayList<Character>();
        ArrayList<Character> a2 = new ArrayList<Character>();
        int count = 0;
        for(int i = 0; i < s1.length(); i++) {
            a1.add(s1.charAt(i));
        }
        for(int j = 0; j < s2.length(); j++) {
            a2.add(s2.charAt(j));
        }
        int len = a1.size();
        for(int i = 0; i < a2.size(); i++) {
            for(int j = 0; j < a1.size(); j++) {
                if(a1.get(j) == a2.get(i)) {
                    a1.remove(j);
                    j--;
                    count++;
                    break;
                } 
            }
        }
        if(count == a2.size()) {
        	System.out.println("Yes " + (len - a2.size()));
        } else {
            System.out.println("No " + (a2.size() - count));
        }
    }
}

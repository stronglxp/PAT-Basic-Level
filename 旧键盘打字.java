package com.codeliu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author liu
 * @version ����ʱ�䣺2018��3��20�� ����2:57:05
 * ��Ŀ����
 * �ɼ����ϻ��˼���������������һ�����ֵ�ʱ�򣬶�Ӧ���ַ��Ͳ�����֡����ڸ���Ӧ�������һ�����֡��Լ���������Щ����
 * ����Ľ�����ֻ���������
 * 
 * ��������
 * ������2���зֱ������������Щ�����Լ�Ӧ����������֡����ж�ӦӢ����ĸ�Ļ����Դ�д������ÿ�������ǲ�����10^5���ַ�
 * �Ĵ������õ��ַ�������ĸ[a-z, A-Z]������0-9���Լ��»��ߡ�_��������ո񣩡���,������.������-������+���������ϵ�������
 * ��Ŀ��֤��2����������ִ��ǿա�ע�⣺����ϵ��������ˣ���ô��д��Ӣ����ĸ�޷��������
 * 
 * �������
 * ��һ��������ܹ�������Ľ�����֡����û��һ���ַ��ܱ��������������С�
 * 
 * ����ʾ��
 * 7+IE.
 * 7_This_is_a_test.
 * 
 * ������
 * _hs_s_a_tst
 */
public class �ɼ��̴��� {
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String error = read.nextLine();
        String input = read.nextLine();
        if(error.length() == 0) {
            System.out.println(input);
            return;
        }
        ArrayList<Character> s1 = new ArrayList<Character>();
        for(int i = 0; i < error.length(); i++) {
        	s1.add(error.charAt(i));
        }
        ArrayList<Character> s2 = new ArrayList<Character>();
        for(int i = 0; i < input.length(); i++) {
        	s2.add(input.charAt(i));
        }
        boolean flag = false;
        for(int i = 0; i < s1.size(); i++) {
            if(s1.get(i) == '+') {
            	s1.remove(i);
                flag = true;
                break;
            }
        }
        if(flag) {
            for(int i = 0; i < s2.size(); i++) {
                if(Character.isUpperCase(s2.get(i))) {
                    s2.remove(i);
                    // Ԫ��ǰ����
                    i--;
                }
            } 
        }
        for(int i = 0; i < s1.size(); i++) {
            for(int j = 0; j < s2.size(); j++) {
            	if(Character.isUpperCase(s1.get(i))) {
            		if(Character.toLowerCase(s2.get(j)) == Character.toLowerCase(s1.get(i))) {
            			s2.remove(j);
            			j--;
            		}
            	} else {
            		if(s2.get(j) == s1.get(i)) {
            			s2.remove(j);
            			j--;
                    }
            	}
            }
        }
        if(s2.size() == 0) {
            System.out.println();
        } else {
            for(int i = 0; i < s2.size(); i++) {
                System.out.print(s2.get(i));
            }
        }
    }
}

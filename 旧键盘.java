package com.codeliu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author liu
 * @version ����ʱ�䣺2018��3��19�� ����7:09:30
 * ��Ŀ����
 * �ɼ����ϻ��˼���������������һ�����ֵ�ʱ�򣬶�Ӧ���ַ��Ͳ�����֡����ڸ���Ӧ�������һ�����֡�
 * �Լ�ʵ�ʱ���������֣������г��϶���������Щ��
 * 
 * ��������
 * ������2���зֱ����Ӧ����������֡��Լ�ʵ�ʱ���������֡�ÿ�������ǲ�����80���ַ��Ĵ���
 * ����ĸA-Z��������Сд��������0-9���Լ��»��ߡ�_��������ո���ɡ���Ŀ��֤2���ַ������ǿա�
 * 
 * �������
 * ���շ���˳����һ������������ļ�������Ӣ����ĸֻ�����д��ÿ������ֻ���һ�Ρ���Ŀ��֤������1��������
 * 
 * ����ʾ��
 * 7_This_is_a_test
 * _hs_s_a_es
 * 
 * ������
 * 7TI
 */
public class �ɼ��� {
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        // Ӧ�������
        String s1 = read.next();
        // ʵ�������
        String s2 = read.next();
        ArrayList<Character> result = new ArrayList<Character>();
        char[] ss2 = new char[s1.toCharArray().length];
        for(int x = 0; x < s2.length(); x++) {
        	ss2[x] = s2.charAt(x);
        }
        char[] ss1 = s1.toCharArray();
        int i = 0, j = 0;
        while(i < ss1.length && j < ss1.length) {
            if(ss1[i] != ss2[j]) {
                if(!result.contains(Character.toUpperCase(ss1[i]))) {
                    result.add(Character.toUpperCase(ss1[i]));
                }
                i++;
            } else {
                i++;
                j++;
            }
        }
        for(int m = 0; m < result.size(); m++) {
            if(result.get(m) >= 'a' && result.get(m) <= 'z') {
                System.out.print(result.get(m));
            } else {
                System.out.print(result.get(m));
            }
        }
    }
}

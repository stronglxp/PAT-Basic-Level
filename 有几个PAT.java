package com.codeliu;

import java.util.Scanner;

/**
 * @author liu
 * @version ����ʱ�䣺2018��3��21�� ����1:03:53
 * ��Ŀ����
 * �ַ���APPAPT�а������������ʡ�PAT�������е�һ��PAT�ǵ�2λ(P),��4λ(A),��6λ(T)��
 * �ڶ���PAT�ǵ�3λ(P),��4λ(A),��6λ(T)���ָ����ַ�������һ�������γɶ��ٸ�PAT��
 * 
 * ��������
 * ����ֻ��һ�У�����һ���ַ��������Ȳ�����10^5��ֻ����P��A��T������ĸ��
 * 
 * �������
 * ��һ������������ַ����а������ٸ�PAT�����ڽ�����ܱȽϴ�ֻ�����1000000007ȡ�����Ľ����
 * 
 * ����ʾ��
 * APPAPT
 * 
 * ������
 * 2
 * ����˼·��ͳ��pat��Ҫpa��������ͳ��pa��Ҫp��������һ��һ���жϼ���
 */
public class �м���PAT {
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String s = read.next();
        char[] r = s.toCharArray();
        int p = 0, pa = 0, pat = 0;
        for(int i = 0; i < r.length; i++) {
            if(r[i] == 'P') {
            	p++;
            } else if(r[i] == 'A') {
            	pa = (pa + p) % 1000000007;
            } else {
            	pat = (pat + pa) % 1000000007;
            }
        }
        System.out.println(pat % 1000000007);
    }
}

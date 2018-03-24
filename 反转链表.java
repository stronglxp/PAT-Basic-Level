package com.codeliu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * @author liu
 * @version ����ʱ�䣺2018��3��18�� ����2:21:54
 * ��Ŀ����
 * ����һ������K�Լ�һ��������L�����д����L��ÿK����㷴ת�����磺����LΪ1��2��3��4��5��6��KΪ3��
 * �����Ӧ��Ϊ3��2��1��6��5��4�����KΪ4�������Ӧ��Ϊ4��3��2��1��5��6������󲻵�K��Ԫ�ز���ת��
 * 
 * ��������
 * ÿ���������1������������ÿ������������1�и�����1�����ĵ�ַ������ܸ���������N(<= 105)���Լ�������K(<=N)��
 * ��Ҫ��ת���������ĸ��������ĵ�ַ��5λ�Ǹ�������NULL��ַ��-1��ʾ����������N�У�ÿ�и�ʽΪ��
 * Address Data Next ����Address�ǽ���ַ��Data�Ǹý�㱣����������ݣ�Next����һ���ĵ�ַ��
 * 
 * �������
 * ��ÿ������������˳�������ת�����������ÿ�����ռһ�У���ʽ��������ͬ��
 * 
 * ��������
 * 00100 6 4
 * 00000 4 99999
 * 00100 1 12309
 * 68237 6 -1
 * 33218 3 00000
 * 99999 5 68237
 * 12309 2 33218
 * 
 * ������
 * 00000 4 33218
 * 33218 3 12309
 * 12309 2 00100
 * 00100 1 99999
 * 99999 5 68237
 * 68237 6 -1
 */
public class ��ת���� {
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        // ��һ���ڵ�ĵ�ַ
        String first = read.next();
        // �ڵ���ܸ���
        int N = read.nextInt();
        // Ҫ��ת�ĸ���
        int K = read.nextInt();
        HashMap<String, Node> nodes = new HashMap<String, Node>();
        List<Node> result = new ArrayList<Node>();
        for(int i = 0; i < N; i++) {
            String address = read.next();
            Node node = new Node(address, read.nextInt(), read.next());
            nodes.put(address, node);
        }
        // �ѽڵ㰴˳�����List
        while(!first.equals("-1")) {
            Node node = nodes.get(first);
            result.add(node);
            first = node.next;
        }
        // ÿ�ζ�K���ڵ���з�ת
        for(int i = 0; i < result.size() - K; i+=K) {
            int m = i;
            int n = i + K - 1;
            while(m < n) {
                Node node = result.get(m);
                result.set(m, result.get(n));
                result.set(n, node);
                m++;
                n--;
            }
        } 
        int i = 0;
        for(i = 0; i < result.size() - 1; i++) {
            System.out.println(result.get(i).address + " " + result.get(i).data + " " + result.get(i + 1).address);
        }
        System.out.println(result.get(i).address + " " + result.get(i).data + " -1");
    }
    static class Node {
        String address;
        int data;
        String next;
        public Node(String address, int data, String next) {
            this.address = address;
            this.data = data;
            this.next = next;
        }
    }
}

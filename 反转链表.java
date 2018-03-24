package com.codeliu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * @author liu
 * @version 创建时间：2018年3月18日 下午2:21:54
 * 题目描述
 * 给定一个常数K以及一个单链表L，请编写程序将L中每K个结点反转。例如：给定L为1→2→3→4→5→6，K为3，
 * 则输出应该为3→2→1→6→5→4；如果K为4，则输出应该为4→3→2→1→5→6，即最后不到K个元素不反转。
 * 
 * 输入描述
 * 每个输入包含1个测试用例。每个测试用例第1行给出第1个结点的地址、结点总个数正整数N(<= 105)、以及正整数K(<=N)，
 * 即要求反转的子链结点的个数。结点的地址是5位非负整数，NULL地址用-1表示。接下来有N行，每行格式为：
 * Address Data Next 其中Address是结点地址，Data是该结点保存的整数数据，Next是下一结点的地址。
 * 
 * 输出描述
 * 对每个测试用例，顺序输出反转后的链表，其上每个结点占一行，格式与输入相同。
 * 
 * 输入例子
 * 00100 6 4
 * 00000 4 99999
 * 00100 1 12309
 * 68237 6 -1
 * 33218 3 00000
 * 99999 5 68237
 * 12309 2 33218
 * 
 * 输出结果
 * 00000 4 33218
 * 33218 3 12309
 * 12309 2 00100
 * 00100 1 99999
 * 99999 5 68237
 * 68237 6 -1
 */
public class 反转链表 {
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        // 第一个节点的地址
        String first = read.next();
        // 节点的总个数
        int N = read.nextInt();
        // 要求反转的个数
        int K = read.nextInt();
        HashMap<String, Node> nodes = new HashMap<String, Node>();
        List<Node> result = new ArrayList<Node>();
        for(int i = 0; i < N; i++) {
            String address = read.next();
            Node node = new Node(address, read.nextInt(), read.next());
            nodes.put(address, node);
        }
        // 把节点按顺序放入List
        while(!first.equals("-1")) {
            Node node = nodes.get(first);
            result.add(node);
            first = node.next;
        }
        // 每次对K个节点进行反转
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

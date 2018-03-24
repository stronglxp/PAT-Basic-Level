package com.codeliu;

import java.util.Scanner;

/**
 * @author liu
 * @version ����ʱ�䣺2018��3��20�� ����5:20:05
 * ��Ŀ����
 * ����Ҫ���д���򣬼���2���������ĺ͡�������̡�
 * 
 * ��������
 * ������һ���а��ա�a1/b1 a2/b2���ĸ�ʽ��������������ʽ�������������з��Ӻͷ�ĸȫ�����ͷ�Χ�ڵ�������
 * ����ֻ���ܳ����ڷ���ǰ����ĸ��Ϊ0��
 * 
 * �������
 * �ֱ���4���а��ա�������1 ����� ������2 = ������ĸ�ʽ˳�����2���������ĺ͡�������̡�
 * ע�������ÿ�������������Ǹ��������������ʽ��k a/b��������k���������֣�a/b�����������֣���Ϊ��������������ţ�
 * ��������ĸΪ0���������Inf������Ŀ��֤��ȷ�������û�г������ͷ�Χ��������
 * 
 * ��������
 * 5/3 0/6
 * 
 * ������
 * 1 2/3 + 0 = 1 2/3
 * 1 2/3 - 0 = 1 2/3
 * 1 2/3 * 0 = 0
 * 1 2/3 / 0 = Inf
 */
public class �������������� {
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String x1 = read.next();
        String x2 = read.next();
        String[] r = x1.split("/");
        int a1 = Integer.parseInt(r[0]);
        int a2 = Integer.parseInt(r[1]);
        Fraction a = new Fraction(a1, a2);
        r = x2.split("/");
        a1 = Integer.parseInt(r[0]);
        a2 = Integer.parseInt(r[1]);
        Fraction b = new Fraction(a1, a2);
        System.out.println(a + " + " + b + " = " + a.add(b));
        System.out.println(a + " - " + b + " = " + a.sub(b));
        System.out.println(a + " * " + b + " = " + a.mul(b));
        System.out.println(a + " / " + b + " = " + a.div(b));
    }
    static class Fraction {
        // ����
        private int num1;
        // ��ĸ
        private int num2;
        
        private int side;
        private int s1;
        private boolean flag = false;
        public Fraction(int num1, int num2) {
            if(num2 == 0) {
                flag = true;
            } else {
            	this.num1 = num1;
                this.num2 = num2;
                if(this.num1 != 0) {
                	shrink();
                }
            }
        }
        private void ji() {
            if(Math.abs(this.num1) >= this.num2) {
                this.side = this.num1 / this.num2;
                s1 = this.num1 - this.side * this.num2;
            }
        }
        // շת��������Լ��
        private int gcd(int num1, int num2) {
            if(num1 < num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
            while(num1 % num2 != 0) {
            	int temp = num1 % num2;
            	num1 = num2;
            	num2 = temp; 
            }
            return num2;
        }
        // Լ��
        private Fraction shrink() {
            int r = gcd(num1, num2);
            this.num1 /= r;
            this.num2 /= r;
            return this;
        }
        
        // �ӷ�
        public Fraction add(Fraction t) {
            return new Fraction(this.num1 * t.num2 + this.num2 * t.num1, this.num2 * t.num2);
        }
        // ����
        public Fraction sub(Fraction t) {
            return new Fraction(this.num1 * t.num2 - this.num2 * t.num1, this.num2 * t.num2);
        }
        // �˷�
        public Fraction mul(Fraction t) {
            return new Fraction(this.num1 * t.num1, this.num2 * t.num2);
        }
        // ����
        public Fraction div(Fraction t) {
            if(this.num2 * t.num1 == 0) {
                flag = true;
            }
            return new Fraction(this.num1 * t.num2, this.num2 * t.num1);
        }
        @Override
        public String toString() {
            if(flag) {
                return String.format("Inf");
            } else if(this.num1 == 0) {
            	return String.format("0");
            } else {
                ji();
                if(this.s1 == 0 && this.side < 0) {
                	return String.format("(%d)", this.side);
                }
                if(this.side == 0 && this.num1 < 0) {
                	return String.format("(%d/%d)", this.num1, this.num2);  
                } else if(this.side == 0 && this.num2 < 0) {
                	return String.format("(-%d/%d)", this.num1, Math.abs(this.num2)); 
                } else if(side == 0 && this.num1 > 0) {
                	return String.format("%d/%d", this.num1, this.num2);  
                } else {
                	if(this.side < 0) {
                		return String.format("(%d %d/%d)", this.side,this.s1,Math.abs(this.num2));
                	} else if(this.s1 == 0) {
                		return String.format("%d", this.side);
                	} else if(this.num2 == 1) {
                		return String.format("%d", this.s1);
                	} else {
                		return String.format("%d %d/%d", this.side, this.s1, this.num2);
                	}  
                }
            }
        }
    }
}	

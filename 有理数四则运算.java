package com.codeliu;

import java.util.Scanner;

/**
 * @author liu
 * @version 创建时间：2018年3月20日 下午5:20:05
 * 题目描述
 * 本题要求编写程序，计算2个有理数的和、差、积、商。
 * 
 * 输入描述
 * 输入在一行中按照“a1/b1 a2/b2”的格式给出两个分数形式的有理数，其中分子和分母全是整型范围内的整数，
 * 负号只可能出现在分子前，分母不为0。
 * 
 * 输出描述
 * 分别在4行中按照“有理数1 运算符 有理数2 = 结果”的格式顺序输出2个有理数的和、差、积、商。
 * 注意输出的每个有理数必须是该有理数的最简形式“k a/b”，其中k是整数部分，a/b是最简分数部分；若为负数，则须加括号；
 * 若除法分母为0，则输出“Inf”。题目保证正确的输出中没有超过整型范围的整数。
 * 
 * 输入例子
 * 5/3 0/6
 * 
 * 输出结果
 * 1 2/3 + 0 = 1 2/3
 * 1 2/3 - 0 = 1 2/3
 * 1 2/3 * 0 = 0
 * 1 2/3 / 0 = Inf
 */
public class 有理数四则运算 {
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
        // 分子
        private int num1;
        // 分母
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
        // 辗转相除求最大公约数
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
        // 约分
        private Fraction shrink() {
            int r = gcd(num1, num2);
            this.num1 /= r;
            this.num2 /= r;
            return this;
        }
        
        // 加法
        public Fraction add(Fraction t) {
            return new Fraction(this.num1 * t.num2 + this.num2 * t.num1, this.num2 * t.num2);
        }
        // 减法
        public Fraction sub(Fraction t) {
            return new Fraction(this.num1 * t.num2 - this.num2 * t.num1, this.num2 * t.num2);
        }
        // 乘法
        public Fraction mul(Fraction t) {
            return new Fraction(this.num1 * t.num1, this.num2 * t.num2);
        }
        // 除法
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

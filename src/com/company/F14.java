package com.company;

public class F14 {
    public static void main(String[] args) {
        int sum = 1; //第十天的第一个桃子
        for(int i = 9; i >= 1;i--) {//倒着循环直至第一天，从第九天开始循环。
            sum  = sum *2 +2;   //每一天的桃子都是叠加的
            System.out.println("第"+i+"天的桃子数为："+sum);
        }
    }
    }


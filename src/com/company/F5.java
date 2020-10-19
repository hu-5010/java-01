package com.company;
import java.util.Scanner;

public class F5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入消费金额");
        int num = scan.nextInt();

        double dis = num * 0.8;// 打折后的价格
        if (dis > 1000) {
            dis = dis - 200;// 200元代金券
        }
        System.out.println(dis);
    }
}

package com.company;

import java.util.Scanner;

public class B3 {
    public static void main(String[] args) {
        String answer;
        Scanner input=new Scanner(System.in);
        System.out.println("你的成绩和格了吗(y/n)");
        answer=input.next();
        while (!"y".equals(answer)){
            System.out.println("上午看书 \n下午写代码");
            System.out.println("你的成绩和格了吗(y/n)");
            answer=input.next();

        }
        System.out.println("合格了!!!");
    }
}

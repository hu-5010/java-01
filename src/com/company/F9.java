package com.company;

import java.util.Scanner;

public class F9 {
    public static void main(String[] args) {
        System.out.print("请输入一个字母：");
        Scanner input = new Scanner(System.in);
        char letter = input.next().charAt(0);

        //判断是否为小写字母
        if (letter>=97 && letter<=122) {
            System.out.println("你输入的是小写字母。");
            letter= (char)(letter-32);
            System.out.println("该字母的大写字母是" + letter + " ");
        }
        else {
            System.out.println("该字母是大写字母。");
        }
    }
}

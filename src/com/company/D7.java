package com.company;
//5、用户登录验证。
//        a)、登录时提示用户输入用户名和密码
//        b)、验证用户名和密码的正确性
//        c)、系统提供用户有3次机会输入用户名和密码，如果超过3次仍不能匹配，程序结束
//        提示：for循环 + if   else-if判断

import java.util.Scanner;

public class D7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String name = input.next();
        System.out.println("请输入密码:");
        String password = input.next();
        for (int i = 3; i >= 1; i--) {
            if ("123456".equals(password) && "admin".equals(name)) {
                System.out.println("登录成功 欢迎");
                break;

            } else if (i!=1) {

                System.out.println("你还有" + i + "次机会,请重新输入");
                System.out.println("请输入用户名:");
                name = input.next();
                System.out.println("请输入密码:");
                password = input.next();

            } else
                System.out.println("你没有权限进入系统");


        }


    }

}


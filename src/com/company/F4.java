package com.company;

import java.util.Scanner;

public class F4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("你想要几行数字:");
        int a=input.nextInt();
        for(int i=1;i<=a;i++){

            for(int j=1;j<=a-i;j++){
                System.out.print(" ");

            }
            for(int b=1; b <=2*i-1; b++){
                System.out.print(i);

            }
            System.out.println();

        }
    }
}

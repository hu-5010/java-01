package com.company;
//打印矩形
public class D1 {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=9;j++){
                System.out.print("*");

            }
            System.out.println();
        }


        //打印平行四边形
        for(int i=1;i<=5;i++){
            for (int k=1;k<=i+1;k++){
                System.out.print(" ");

            }
            for(int j=1;j<=9;j++){
                System.out.print("*");

            }
            System.out.println();
        }

        //等腰三角形
        for(int i=1;i<=5;i++){
            for(int k=1;k<=9-i;k++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");

            }
            System.out.println();
        }


    }
}

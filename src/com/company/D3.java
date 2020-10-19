package com.company;

//打印菱形
public class D3 {
    public static void main(String[] args) {
        int i, j, k, c, e, b;
        for (i = 1; i <= 5; i++) {
            for (k = 1; k <= 5 - i; k++) {
                System.out.print(" ");

            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("6");

            }
            System.out.println();
        }
        for (c = 4; c >= 1; c--) {
            for (b = 1; b <=5-c; b++) {
                System.out.print(" ");

            }
            for (e = 1; e <= 2 * c - 1; e++) {
                System.out.print("9");

            }


            System.out.println();
        }


    }
}

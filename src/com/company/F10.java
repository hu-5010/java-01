package com.company;

import java.util.zip.DeflaterOutputStream;

public class F10 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if(i%7 ==0 || i%10 == 7 || i/10 == 7){
                continue;
            }
            System.out.println("不等于7的数字有:"+i);
            sum += i;
        }
        System.out.println(sum);

    }
}

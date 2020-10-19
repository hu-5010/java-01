package com.company;

import java.util.zip.DeflaterOutputStream;

public class B2 {
    public static void main(String[] args) {
        int sum = 0;
        int i=2;
        while (i<=100){
            sum+=i;
            i=i+2;
        }
        System.out.println("sum="+sum);
    }
}

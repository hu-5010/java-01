package com.company;

public class F12 {
    public static void main(String[] args) {
        double sum=0;
        double mo=1;
        for(int i=1;i<=30;i++) {
            sum+=mo;
            System.out.println("i:"+i+",money:"+mo+",sum:"+sum);
            mo*=1.5;
        }
        System.out.println((int)sum);

    }
}

package com.company;

public class F11 {
    public static void main(String[] args) {
        double money=1;
        int day=1;
        while(money<10) {
            money*=1.5;
            day++;
            System.out.println("day:"+day+",money:"+money);
        }
        System.out.println(day);
    }
}

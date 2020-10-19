package com.company;

public class F13 {
    public static void main(String[] args) {
        int day=1;//天数
        double sum=0;//爬过的距离
        while(true) {
            //白天向上爬5米
            sum+=5;
            System.out.println("day:"+day+",sum:"+sum);
            if(sum>=56.7) {//如果爬出了井
                //退出循环
                break;
            }
            //晚上掉3.5;
            sum-=3.5;
            day++;
        }
        System.out.println("爬上来用了"+day);

    }
}

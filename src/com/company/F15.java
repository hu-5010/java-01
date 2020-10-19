package com.company;
//编写程序解决“百钱买百鸡”问题。公鸡五钱一只，母鸡三钱一只，小鸡
        //一钱三只，现有百钱欲买百鸡，共有多少种买法？
public class F15 {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            for (int j = 0; j <= 33; j++) {
                for (int k = 0; k <= 100; k+=3) {
                    if (i + j + k == 100&& i*5 + j*3 + k/3 ==100 ) {
                        System.out.println("公鸡："+i+" 母鸡:"+j+" 小鸡:"+k);
                        break;
                    }
                }
            }
        }

    }
}

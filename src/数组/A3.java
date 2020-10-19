package 数组;

//求出4家店的最低手机价格rt java.util.Scanner;

import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        int[] scores = new int[4];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入" + (i + 1) + "家手机店的价格:");
            scores[i] = input.nextInt();
            if(scores[i]>0){

            }else{
                System.out.println("你的输入有误");
                continue;
            }

        }

        int max = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] < max) {
                max = scores[i];

            }
            }

        System.out.println("最低的价格为:" + max);
    }

}
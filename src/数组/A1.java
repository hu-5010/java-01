package 数组;

import java.util.Scanner;

public class A1<sum> {
    public static void main(String[] args) {
        int[] figure = {8, 4, 2, 1, 23, 344, 12};
        int sum = 0;//和
        for (int i = 0; i < figure.length; i++) {
            sum += figure[i];
        }
        System.out.println("这些数的总和为" + sum);
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个数");
        int num = input.nextInt();
        boolean flag=false;
        for (int i=0;i<figure.length;i++) {
            if ( figure[i]== num) {
                flag=true;
                break;

            }

        }
        if(flag){
            System.out.println("包含这个数");

        }else{
            System.out.println("不包含这个数");
        }

    }
}


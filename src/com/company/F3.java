package com.company;

import java.util.Scanner;

//4、从键盘输入一位整数，当输入1~7时，输出“星期一”~“星期日”
//        输入其他数字时，提示用户重新输入
public class F3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        for(int i=1;i<=7;i++){
            System.out.println("请从键盘输入一个数字:");
            int figure=input.nextInt();
            if(figure==1){
                System.out.println("星期一");
                break;
            }else if(figure==7){
                System.out.println("星期日");
                break;


            }else if(figure!=1&&figure!=7){
                System.out.println("重新输入");
                continue;

            }


        }

    }
}

package com.company;

import java.util.Scanner;

//、使用for循环结构实现：从键盘上接收从周一至周五每天的学习时间（以小时为单位），并计算每日平均学习时间。输出结果如图所示。
//        控制台：
//        请输入周1的学习时间：8
//        请输入周2的学习时间：9 
//        请输入周3的学习时间：7
//        请输入周4的学习时间：10
//        请输入周5的学习时间：8
//        周一~周5学习平均为：8.4小时！
public class C2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int time = 0;
        int vag = 0;
        double s=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入周" + (i + 1) + "学习的时间");
            time = input.nextInt();
            vag = vag + time;
        }
        System.out.println("周一到周五的学习时间和为:" + vag);
        s = (double) vag/5;
        System.out.println("周一到周五的平均学习时间为:" + s);
    }
}

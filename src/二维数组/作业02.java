package 二维数组;

import java.util.Arrays;
import java.util.Scanner;

public class 作业02 {
    public static void main(String[] args) {
//        输入五种水果的英文名称(如葡萄grape，橘子orange，香蕉banana，苹果apple，桃peach)
//    ，编写一个程序，输出这些水果的名称(按照在字典里出现的先后顺序输出)
        String[] fruits=new String[5];
        Scanner input=new Scanner(System.in);
        for (int i = 0; i <fruits.length; i++) {
            System.out.println("请输入第"+(i+1)+"个水果的名字");
            fruits[i]=input.next();
        }
        Arrays.sort(fruits);
        System.out.println("这些水果的排序是");
        System.out.println(Arrays.toString(fruits));

    }
}

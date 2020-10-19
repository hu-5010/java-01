package 数组;

import java.util.Scanner;

//数组存储5笔购物金额，在控制台输出并计算总金额
public class A4 {
    public static void main(String[] args) {
        double[] money=new double[5];//动态初始化
        double total=0;
        Scanner input=new Scanner(System.in);
        System.out.println("请输入本月会员等消费记录");
        for(int i=0;i<money.length;i++){
            System.out.println("请输入第"+(i+1)+"次的消费金额");
             money[i]=input.nextDouble();
             total+=money[i];

        }
        System.out.println();
        System.out.println("序号\t\t\t\t金额");
        System.out.println("1\t\t\t\t"+money[0]);
        System.out.println("2\t\t\t\t"+money[1]);
        System.out.println("3\t\t\t\t"+money[2]);
        System.out.println("4\t\t\t\t"+money[3]);
        System.out.println("5\t\t\t\t"+money[4]);
        System.out.println("总金额是:"+total);
        }

    }


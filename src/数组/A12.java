package 数组;
//向一个长度为10的整型数组中随机生成10个0~9的随机整数，完成下列任务
//        1)统计每个数字出现了多少次
//        2)输出出现次数最多的数字
//        3)输出只出现一次的数字中最小的数字
public class A12 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = (int) (10 * Math.random());
            System.out.print(a[i] + "\t");

    }
}}

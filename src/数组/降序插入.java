package 数组;

import java.util.Scanner;
//加入一个学员的成绩  奖她插入成绩 保持降序
public class 降序插入 {
    public static void main(String[] args) {
        int[] list = new int[6];
        list[0] = 99;
        list[1] = 38;
        list[2] = 73;
        list[3] = 65;
        list[4] = 42;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学生的成绩:");
        int num = input.nextInt();
        //找到num 要插入的位置index 找到num比数组中元素(第一个)大的位置
        int index = list.length - 1;//下标
        for (int i = 0; i < list.length; i++) {
            if (num > list[i]) {
                index = i;//下标的值

                break;

            }}//成绩往后挪一位
            for (int i = list.length - 1; i > index; i--) {//list.length-1等于5  list[5]=list[4] 以次类推
                list[i] = list[i - 1];//从大到小

            }
            list[index] = num;//在下标的位置将数字插入进去
            System.out.println("插入的成绩的下标是:" + index);
            System.out.println("插入新的成绩最后的成绩是:");
            for (int listnum : list) {
                System.out.print(+listnum + "\t");


            }
        }
    }

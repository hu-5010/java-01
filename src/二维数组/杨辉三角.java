package 二维数组;

import java.util.Scanner;

public class 杨辉三角 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你要的三角形的行数");
        int n = input.nextInt();
        int[][] arr = new int[n][n];
        //给每一行数组的第一列和最后一列赋值为1
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = 1;
            arr[i][i] = 1;
        }
        //每行每列数据都是上一行的前一列数据和这一列数据之和
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j <=i - 1; j++) {//j不能从0开始  因为第一列已经有值了
                arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
            }
        }
        //遍历二维数组  跟九九乘法表一样的遍历方式  右上角的不要
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        input.close();
    }
}

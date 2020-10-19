package 二维数组;

import java.util.Scanner;

public class 作业05 {
    public static void main(String[] args) {
        int[][] scores = new int[4][3];
        int sum=0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("第" + (i + 1) + "季度");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.println("请输入第" + (i + 1) + "季度的第" + (j + 1) + "的销售额");
                scores[i][j] = input.nextInt();
                sum+=scores[i][j];
            }
            System.out.println("第" + (i + 1) + "个季度的总销售额是" + sum);

        }

    }
}

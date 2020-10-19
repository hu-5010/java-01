package 二维数组;

import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        int[][] scores = new int[3][3];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("第" + (i + 1) + "个班级");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.println("请输入第" + (i + 1) + "个班级的第" + (j + 1) + "个学生的成绩");
                scores[i][j] = input.nextInt();
            }
        }
        System.out.println("统计考试成绩");
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];

            }
            System.out.println("第" + (i + 1) + "个班的同学的总成绩是" + sum);

        }
    }
}

package 二维数组;

import jdk.nashorn.internal.ir.ForNode;

import java.util.Scanner;

//使用二维数组存储班上五个学生三门功课的考试成绩，要求输出每一个学生的总分、平均分、最高分、最低分
public class 作业04 {
    public static void main(String[] args) {
        int[][] scores = new int[5][3];
        int max = 0;
        int min = 0;
        int avg;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            int sum = 0;
            System.out.println("第" + (i + 1) + "个学生");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.println("请输入第" + (i + 1) + "个学生的第" + (j + 1) + "门课的成绩");
                scores[i][j] = input.nextInt();
                sum += scores[i][j];
            }
            avg = sum / scores.length;
                max = min = scores[i][0];
                for (int n = 0; n < scores[i].length; n++) {
                    if (scores[i][n] > max) {
                        max = scores[i][n];
                    }
                    if (scores[i][n] < min) {
                        min = scores[i][n];
                    }

                }

                System.out.println("第" + (i + 1) + "个的同学的总成绩是" + sum);
                System.out.println("第" + (i + 1) + "个的同学的平均分是" + avg);
                System.out.println("第" + (i + 1) + "个的同学的最高分是" + max);
                System.out.println("第" + (i + 1) + "个的同学的最低分是" + min);

            }

        }


    }

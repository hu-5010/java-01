package 二维数组;
//、java定义一个3*5的二维数组，用来存储某班级3位学员的5门课的成绩
//        定义一个3*5的二维数组，用来存储某班级3位学员的5门课的成绩；这5门课
//        按存储顺序依次为：Java，JSP，CoreJava，MySQL和HTML5。
//        （1）循环给二维数组的每一个元素赋0~100之间的随机整数 (int)(Math.random()*100)
//        （2）按照列表的方式输出这些学员的每门课程的成绩。
//        （3）要求编写程序求每个学员的总分，将其保留在另外一个一维数组中。
//        （4）要求编写程序求所有学员的某门课程的平均分

import java.util.Arrays;
import java.util.Scanner;

public class 作业06 {
    public static void main(String[] args) {
        int[][] scores = new int[3][5];
        System.out.println("Java\tJsp\tCoreJava\tMySQL\tHtml5");
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                scores[i][j] = (int) (Math.random() * 100);
                System.out.printf(scores[i][j] + "\t \t ");
            }
            System.out.println();
        }

        int Allstudent = 0;//存储总分的变量
        int[] sum = new int[3];
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                Allstudent += scores[i][j];
            }
            if (i % 3 == 0) {
                System.out.println();
            }
            sum[i] = Allstudent;//通过循环把Allstudent接收到的总分放入数组

            System.out.print("第" + (i + 1) + "位学生的总分：" + sum[i] + "\t");
            Allstudent = 0;
            System.out.println();
        }
        System.out.println();
        System.out.println("新的数组" + Arrays.toString(sum));

        for (int i = 0; i < sum.length; i++) {
            int age = sum[i] / 3;
            System.out.printf("第" + (i + 1) + "位学生的平均分为：" + age + "\t");
            System.out.println();
        }

    }
}

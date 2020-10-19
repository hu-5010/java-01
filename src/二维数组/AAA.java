package 二维数组;

import java.util.Arrays;

public class AAA {
    public static void main(String[] args) {
        int[][] scores = new int[3][5];
        System.out.println("Java\tJsp\tCoreJava\tMySQL\tHtml5");
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                scores[i][j] = (int) (Math.random() * 100);
                System.out.printf(scores[i][j]+"\t \t ");
            }System.out.println();
        }

        int Allstudent = 0;//存储总分的变量
        int[] sum = new int[3];
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                Allstudent += scores[i][j];
            }
            if (i%3==0){
                System.out.println();
            }
            sum[i]=Allstudent;//通过循环把Allstudent接收到的总分放入数组

            System.out.print("第"+(i+1)+"位学生的总分："+sum[i]+"\t");
            Allstudent=0;
            System.out.println();
        }
        System.out.println();
        System.out.println("新的数组"+Arrays.toString(sum));

        for (int i = 0; i < sum.length; i++) {
            int age = sum[i]/3;
            System.out.printf("第"+(i+1)+"位学生的平均分为："+age+"\t");
            System.out.println();
        }
    }
}

package 数组;

import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
      int[] scores=new int[5];
      Scanner input=new Scanner(System.in);
      for(int i=0;i<scores.length;i++){
          System.out.println("请输入第"+(i+1)+"位同学的JAVA的成绩");
          scores[i]=input.nextInt();

      }
      int max=scores[0];
      for(int i=1;i<scores.length;i++){
          if(scores[i]>max){
              max=scores[i];

          }
      }
        System.out.println("成绩最高分为"+max);
    }
}

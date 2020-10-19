package 数组;
//向一个长度为10的整型数组中随机生成10个0~9的随机整数，完成下列任务
//        1)统计每个数字出现了多少次
//        2)输出出现次数最多的数字
//        3)输出只出现一次的数字中最小的数字
import java.util.Arrays;
import java.util.Scanner;

public class 随机 {
    public static void main(String[] args) {
        int[] nums=new int[10];
       Scanner input=new Scanner(System.in);
        for (int i = 0; i <nums.length; i++) {
            nums[i] =(int)(Math.random()*10);
        }
        System.out.println("随机数为:"+ Arrays.toString(nums));
        int[] sums=new int[10];
        for (int i = 0; i <sums.length; i++) {
            for (int j = 0; j <nums.length; j++) {
                if(nums[j]==i){
                    sums[i]++;//累加
                }

            }

        }
        System.out.println("新的数组:"+ Arrays.toString(sums));
        for (int i = 0; i <sums.length; i++) {
            if(sums[i]!=0){
                System.out.println(i+"出现了"+sums[i]+"次");
            }

        }
        int max=0;
        for (int i = 0; i <sums.length; i++) {
            if(sums[i]>max){
                max=sums[i];

            }

        }
        for (int i = 0; i <sums.length; i++) {
            if(sums[i]==max){
                System.out.println("出现最多的值为:"+i);

            }
        }
        for (int i = 0; i <sums.length; i++) {
            if(sums[i]==1){
                System.out.println("出现的最小的值为:"+i);
                break;

            }

        }

        }
    }


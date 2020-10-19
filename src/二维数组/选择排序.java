package 二维数组;

import java.util.Arrays;

public class 选择排序 {
    public static void main(String[] args) {
        //选择排序
        //定义数组
        //循环比较 下标为i的元素依次和之后的所有的元素比较 找到本轮最小或最大的元素
        //交换元素 将最小元素与下标为i的元素交换
        int[] arr = {4, 7, 3, 9, 1,6 };
        int min = -1;
        for (int i = 0; i < arr.length-1; i++) {//完成循环  比较几轮
            min = i;//每轮 min 初始值
            for (int j = i + 1; j < arr.length; j++) {//内层 当前元素和后面的元素比较,记录最新的最小元素下标
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i) {//如果min值发生变化 说明发现了更小的值  则将当前值和更小的值交换 保证小值放在数组前面
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;

            }
        }
        for(int num:arr){
            System.out.print(num+"\t");
        }//输出排序后的数组
    }
}

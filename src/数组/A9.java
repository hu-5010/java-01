package 数组;
import java.util.Scanner;
public class A9 {
    public static void main(String[] args) {
       int [] nums={45,54,65,32,47,87};
        System.out.print("冒泡前排序:");
        for(int num:nums){
            System.out.print(num+"\t");
        }
        for (int i = 0; i <nums.length-1; i++) {
            for (int j = 0; j <nums.length-1-i; j++) {
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }

            }
        }
        System.out.print("冒泡后的排序:");
        for(int num:nums){
            System.out.print(num+"\t");
        }
    }
}

package 数组;

//定义一个数组int[] nums={8,7,3,9,5,4,1}
//        输出数组中的最大值和最大值所在的下标
public class A10 {
    public static void main(String[] args) {
        int[] nums = new int[7];
        nums[0] = 8;
        nums[1] = 7;
        nums[2] = 3;
        nums[3] = 9;
        nums[4] = 5;
        nums[5] = 4;
        nums[6] = 1;
        int max = nums[0];//最大值
        int a = 0;//下标
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                a = i;
            }

        }
        System.out.println("最大的值为" + max);
        System.out.println("下标为:" + a);
    }
}

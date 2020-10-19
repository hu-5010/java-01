package 数组;

public class 冒泡排序算法 {
    public static void main(String[] args) {
        //冒泡排序  升序排列
        int[] nums = {12, 16, 6, 3, 19};
        System.out.print("冒泡排序前:");
        for (int num : nums) {
            System.out.print(num + "\t");
        }
        for (int i = 0; i < nums.length - 1; i++) {//数组的下标长度-1
            //每一轮比较几次
            for (int j = 0; j < nums.length - 1 - i; j++) { //每一轮比较几次
                //按规律比较并交换,当前面的数字比后面大的时候 执行换位
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }

            }
        }
        System.out.print("冒泡排序后:");
        for (int num : nums) {
            System.out.print(num + "\t");
        }

    }
}

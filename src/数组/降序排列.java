package 数组;

public class 降序排列 {
    public static void main(String[] args) {
        int[] nums = {12, 16, 6, 3, 19};
        System.out.print("降序排序前:");
        for (int num : nums) {
            System.out.print(num + "\t");
        }
        for (int i = 0; i < nums.length - 1; i++) {
            //每一轮比较几次
            for (int j = 0; j < nums.length - 1 - i; j++) { //每一轮比较几次
                //按规律比较并交换,当前面的数字比后面大的时候 执行换位
                if (nums[j] <nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }

            }
        }
        System.out.print("降序排序后:");
        for (int num : nums) {
            System.out.print(num + "\t");
        }
    }
}

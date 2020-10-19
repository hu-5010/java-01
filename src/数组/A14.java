package 数组;

public class A14 {
    public static void main(String[] args) {
        int[] nums = {45, 43, 22, 46, 86, 54, 64, 34};
        System.out.print("冒泡前的排列是:");
        for (int num : nums) {
            System.out.print(num + "\t");
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int a = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = a;
                }
            }
        }
        System.out.print("冒泡后的排列是:");
        for (int num : nums) {
            System.out.print(num + "\t");
        }
    }
}

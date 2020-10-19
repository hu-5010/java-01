package 数组;
//. 向一个长度为10的整型数组中随机生成10个0~9的随机整数，完成下列任务
//        1)升序输出、降序输出
//        2)输出总和、平均数
public class A11 {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int total=0;
        double vag=0;
        for (int i = 0; i < 10; i++) {
            nums[i] = (int) (10 * Math.random());
            System.out.print(nums[i]+"\t");
            total+=nums[i];
            vag=total/10;
    }

        for (int i = 0; i < nums.length - 1; i++) {
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
        System.out.print("排列后的数为:");
        for (int num : nums) {
            System.out.print(num + "\t");

        }
        System.out.println();
        System.out.println("和为"+total);
        System.out.println("平均值为"+vag);
}}

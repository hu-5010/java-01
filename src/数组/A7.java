package 数组;

//获取数组最大值和最小值操作：
//        利用Java的Math类的random()方法，随机生成10个数，填充一个数组，并找出产生10个随机数中最大的、最小的数。
//        提示：使用 int num=(int)(100*Math.random());
public class A7 {
    public static void main(String[] args) {
        int[] sum = new int[10];
        for (int i = 0; i < 10; i++) {
            sum[i] = (int) (100 * Math.random());
            System.out.print(sum[i]+"\t");
        }

        int max = sum[0];
        int min = sum[0];
        for (int i = 1; i < sum.length; i++) {
            if (sum[i] > max) {
                max = sum[i];

            } else if (sum[i] < min) {
                min = sum[i];

            }
        }
        System.out.println("最大值为:" + max);
        System.out.println("最小值为:" + min);

    }
}

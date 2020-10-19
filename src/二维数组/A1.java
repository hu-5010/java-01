package 二维数组;

public class A1 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int i = 3;//要查找的数
        int a = 0;//查找开始的范围
        int b = arr.length - 1;//查找结束的范围
        int c = -1;
        boolean f = false;
        do {
            c = (a + b) / 2;
            if (arr[c] == i) {
                System.out.println("找到这个数" + i);
                f = true;
                break;
            } else if (arr[c] > i) {
                b = c - 1;
            } else {
                a = c + 1;
            }

        } while (a <= b);
        if (!f) {
            System.out.println("没有找到这个数");
        }
    }
}
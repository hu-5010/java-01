package 二维数组;

import java.util.Arrays;

public class 插入字符串 {
    //向原数组中增加新的元素
    public static void main(String[] args) {
        String[] Fruits = {"apple", "peach", "pear", "banana", "grape"};
        String[] newFruits = new String[Fruits.length + 1];
        System.arraycopy(Fruits, 0, newFruits, 0, Fruits.length);
        for (int i = 0; i < newFruits.length; i++) {
            if (newFruits[i] == null) {//检测新数组下标是否为空
                newFruits[i] = "orange";
            }
        }
        System.out.println(Arrays.toString(newFruits));


        //合并数组
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] c = new int[a.length + b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        System.out.println(Arrays.toString(c));
    }
}
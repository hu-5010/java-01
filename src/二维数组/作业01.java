package 二维数组;

import java.util.Arrays;

public class 作业01 {
    public static void main(String[] args) {
//        使用Arrays工具类Arrays.sort(数组名)升序排列一组字符char[] chars = {'a','c','u','b','e','p','f','z'}，
//        并查找某个特殊字符在升序后数组中的位置(下标)。
        char[] chars = {'a','c','u','b','e','p','f','z'};
      Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));
        int index= Arrays.binarySearch(chars,'a');
        System.out.println("对应的下标为"+index);
    }
}

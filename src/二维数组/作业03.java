package 二维数组;
//数组去重
import java.util.Arrays;

public class 作业03 {
    public static void main(String[] args) {
        // int[] arr11 = {1,2,3,4,5,6,7,8,9,0,3,2,4,5,6,7,4,32,2,1,1,4,6,3}; 数组去重
        int[] arr11 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 3, 2, 4, 5, 6, 7, 4, 32, 2, 1, 1, 4, 6, 3};
        int[] arr12 = new int[0];
        boolean flag = false;
        int index = 0;   //下标
        for (int i = 0; i < arr11.length; i++) {
            flag = false;
            for (int j = i + 1; j < arr11.length; j++) {
                if (arr11[i] == arr11[j]) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                arr12 = Arrays.copyOf(arr12, arr12.length+1);
                arr12[index++] = arr11[i];

            }
        }
        Arrays.sort(arr12);
        System.out.println(Arrays.toString(arr12));


    }
}

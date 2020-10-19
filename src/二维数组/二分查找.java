package 二维数组;
public class 二分查找 {
        public static void main(String[]args){
            int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            int searchNum = 6;//要查找的数字
            int startIndex = 0;//定义开始查找的范围的下标
            int endIndex = arr.length - 1;//定义开始结束查找的下标
            int midIndex = -1;
            boolean flag = false;
            do {
                midIndex = (startIndex + endIndex) / 2;
                if (arr[midIndex] == searchNum) {
                    System.out.println("恭喜你找到这个数" + midIndex);
                    flag = true;
                    break;
                } else if (arr[midIndex] > searchNum) {
                    endIndex = midIndex - 1;
                } else {
                    startIndex = midIndex + 1;
                }
            } while (startIndex <= endIndex);
            if (!flag) {
                System.out.println("很抱歉,没有找到你要的数字");
            }


        }

}
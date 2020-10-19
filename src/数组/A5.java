package 数组;
//使用数组静态初始化方式初始化一个大小为10的整型数组并输出。
public class A5 {
    public static void main(String[] args) {
        int[] sums={23,32,1,2,23,1,3,11,3,5};//静态初始化
        System.out.println(sums.length);
        for(int i=0;i<10;i++){
            System.out.println("输入的数"+sums[i]);

        }
    }
}

package 二维数组;

import java.util.Arrays;
import java.util.Scanner;

public class 删除元素 {
    public static void main(String[] args) {
        String[] names = {"tome", "jack", "san", "alice", "robin"};
        Scanner input = new Scanner(System.in);
        System.out.println("请选择要删除的人员姓名:");
        String name = input.next();
        int j = -1;
        for (int i = 0; i < names.length; i++) {
            if (name.equalsIgnoreCase(names[i])) {
                j = i;
                break;

            }
        }
        System.out.println("j=" + j);
        if (j != -1) {
            for (int i = j; i < names.length - 1; i++) {
                names[i] = names[i + 1];
            }
            System.out.println(Arrays.toString(names));
            names[names.length - 1] = null;
        } else {
            System.out.println("没有你要删除的名字");
        }
        System.out.println("删除后的人员姓名是");
        for (int i = 0; i < names.length - 1; i++) {
            System.out.print(names[i] + "\t");
        }
    }
}

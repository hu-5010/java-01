package 二维数组;

import java.util.Arrays;
import java.util.Scanner;

public class 数组修改 {
    public static void main(String[] args) {
        //数组修改(替换)
        String[] names = {"tome", "jack", "san", "alice", "robin"};
        Scanner input = new Scanner(System.in);
        System.out.println("请选择要修改的人员姓名:");
        String name = input.next();
        System.out.println("请输入新的人员姓名");
        String newname=input.next();
        int j = -1;
        for (int i = 0; i < names.length; i++) {
            if (name.equalsIgnoreCase(names[i])) {
                j = i;
                break;

            }
        }
        System.out.println("j=" + j);
        if (j != -1) {
                names[j] = newname;
            System.out.println(Arrays.toString(names));
        } else {
            System.out.println("没有你要修改的名字");
        }
        System.out.println();
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + "\t");
        }
    }
}

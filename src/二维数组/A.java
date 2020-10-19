package 二维数组;

import java.util.Arrays;
import java.util.Scanner;

public class A<Public> {
    public static void main(String[] args) {
       String[] names={"tome", "jack", "sam", "alice",  "ruby", "Robin"};
       String[] newname=new String[names.length];
       newname= Arrays.copyOf(names,newname.length+1);
        Scanner input=new Scanner(System.in);
        System.out.println("请输入增加的姓名:");
        String name1=input.next();
        int j=-1;
        for (int i = 0; i <newname.length; i++) {
            if (newname[i] == null) {
                j = i;
                break;
            }
        }
        if(j!=-1){
            newname[j]=name1;
            System.out.println("添加成功");
        }
        System.out.println("新家之后的数组为"+Arrays.toString(newname));


    }
}


package 二维数组;
import java.util.Arrays;
import java.util.Scanner;

//增,删,改,插合集
public class 数组增加 {
    public static void main(String[] args) {
        //数组增加(插入)
        String[] names = {"tome", "jack", "sam", "alice",  "ruby", "Robin"};
        String[] newName=new String[names.length];
        newName= Arrays.copyOf(names,newName.length+1);
        Scanner input=new Scanner(System.in);
        System.out.println("请输入要增加的名字");
        String sname=input.next();
        int j=-1;
        for (int i = 0; i <newName.length; i++) {
            if(newName[i]==null){
                j=i;
                break;
        }
        }
        if(j!=-1){
            newName[j]=sname;
            System.out.println("添加成功");
        }else {
            System.out.println("人员已满");
        }
        System.out.println("新增加后的数组为"+Arrays.toString(newName));



    }}


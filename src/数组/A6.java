package 数组;

import java.util.Scanner;

// 数组查找操作：定义一个长度为10 的一维字符串数组，在每一个元素存放一个单词；然后运行时从命令行输入一个单词，
//         程序判断数组是否包含有这个单词，包含这个单词就打印出“Yes”，不包含就打印出“No”。
public class A6 {
    public static void main(String[] args) {
        String[] word=new String[10];
        word[0]="q";
        word[1]="b";
        word[2]="c";
        word[3]="v";
        word[4]="o";
        word[5]="l";
        word[6]="p";
        word[7]="r";
        word[8]="y";
        word[9]="a";
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个单词");
        String num = input.next();
        boolean flag=false;
        for (int i=0;i<word.length;i++) {
                if (num.equals(word[i])) {
                    flag=true;
                    break;

                }

            }
            if(flag){
                System.out.println("yes");

            }else{
                System.out.println("no");
            }


        }

    }


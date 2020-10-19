package com.company;
//1、请根据英文单词的第一个字母判断星期几，如果第一个字母一样，则继续判断第二个字母
//。例如：如果第一个字母S，则继续判读第二个字母，如果第二个字母是a,则输出“星期六”。
public class A1 {
    public static  void main(String[] args) {
        int n = 0;
        for(int i=2; i<100; i++){
            boolean flag = true;
            for(int j=2; j<=i/2; j++){
                if(i%j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.print(i+"、 ");
                n++;
            }
        }
        System.out.println("\n共 "+ n +" 个素数");

    }
}

package com.company;
//3、使用循环输出 100、95、90、85.......5
//        提示：可尝试使用for、while、do-while三种循环实现
public class F2 {
    public static void main(String[] args) {
      for(int i=100;i>1;i--){
          if(i%5==0) {
              System.out.print(i + " ");
          }
        }

    }
}
package com.company;

//开发一个标题为”FlipFlop”的游戏应用程序。它从1计数到100，遇到3的倍数就输出单词”Flip”，
//        遇到5的倍数就输出单词”Flop”，既为3的倍数又为5的倍则输出单词”FlipFlop”，其余情况下输出当前数字
//        。提示：使用%运算符取得数字的余数。循环从循环变量i为1开始，循环次数是100。
public class C4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {

            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("输出单词plipplop");
            } else if (i % 3 == 0) {
                System.out.println("输出单词flop");

            } else if (i % 5 == 0) {
                System.out.println("输出单词plip");
            } else {
                System.out.println(i);
            }
        }
    }
}

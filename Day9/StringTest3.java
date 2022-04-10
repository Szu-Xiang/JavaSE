package Test;

import java.util.Scanner;

/*
    需求：键盘录入一个字符串，统计大写字母、小写字母以及数字的数量。
    大写判断：ch >= 'A' && ch <= 'Z';
    小写判断：ch >= 'a' && ch <= 'z';
    数字判断：ch >= '0' && ch <= '9';
 */

public class StringTest3 {
    public static void main(String[] args) {
        System.out.println("Please input a string:");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        int big = 0;
        int small = 0;
        int number = 0;

        //将字符串拆分成字符数组
        char[] chars = line.toCharArray();

        for (int i = 0; i < line.length(); i++) {
            char s = line.charAt(i);
            if (s >= 'A' && s <= 'Z') {
                big++;
            } else if (s >= 'a' && s <= 'z') {
                small++;
            } else if (s >= '0' && s <= '9'){
                number++;
            }
        }

        System.out.println("大写字母有：" + big + "个");
        System.out.println("小写字母有：" + small + "个");
        System.out.println("数字有：" + number + "个");
    }
}

package Test;

import java.util.Scanner;

/*
    键盘录入一个字符串，使用程序倒序输出出来。
    遍历字符串：charAt(int index),返回特定索引处的char值，字符串索引也是从0开始。
    获取长度：public int length()
 */
public class StringTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        for(int i = line.length() - 1; i >= 0; i--){
            char s = line.charAt(i);
            System.out.print(s);
        }

    }

}

package Test;

import java.util.Scanner;

/*
    1、以字符串方式接收一手机号，将中间四位号码屏蔽
    例如：137****5659

    截取方法：
        public String substring(int beginIndex) : 根据传入的索引，截取当前字符串，并返回新字符串。
        public String substring(int beginIndex, int endIndex);

    2、屏蔽敏感词，如"TMD"。
 */
public class StringTest4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replace("TMD", "***");
        System.out.println(s);
        /*
        String tel = sc.nextLine();


        String start = tel.substring(0,3);
        String end = tel.substring(7);

        System.out.println(start + "****" + end);

         */
    }
}

package Test;

import java.util.Scanner;

/*
    以字符串的形式，录入学生信息，例如："张三，23"，从该字符中切割出有效信息，封装为学生类
 */
public class StringTest5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the information:");
        String info = sc.next();

        String[] str = info.split(",");

        System.out.println("The name is :" + str[0]);
    }



}


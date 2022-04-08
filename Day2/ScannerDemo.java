package Test2;
/*
    Scanner键盘录入的效果 （仅供学习期间，真实开发不需要）

    步骤：
        1、在class上面导入库
        2、定义，在main方法里：
                        Scanner sc = new Scanner(System.in);
        3、用变量名去实现功能：
                        sc.nextInt();  输出整数
                        sc.next(); 输出字符串
 */

import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
        System.out.println("Please enter your age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        System.out.println("Please enter your name:");
        String name = sc.next();
        System.out.println(name);
    }
}

package Demo;

/*
        输出100～999的所有水仙花数。（个位立方和等于原数的则为水仙花数）
 */

import java.util.Scanner;
public class ForDemo {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i <=999; i++){
            int a = i / 100;
            int b = i / 10 % 10;
            int c = i % 10;
            int sum = a*a*a + b*b*b + c*c*c;

            if (sum == i){
                System.out.print(sum + " "); //print 打印不分行
                count++;
                if(count % 2 == 0){
                    System.out.println();
                }
            }
        }
        System.out.println("水仙花数一共有" + count + "个");

    }
}

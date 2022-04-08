package Test;

/*
    需求1：定义一个长度为5的数组，用范围为20～80的随机数赋值。
    实现：
        int[] arr = new int[5];
        Random r = new Random();

        System.out.println("Random Numbers are:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(61) + 20;
            System.out.println(arr[i]);

        }

     需求2：键盘录入一个整数作为数组的长度，随后再次键盘录入数据并将数组存满。从数组中找出最小值，并将最小值打印在控制台
         Scanner sc = new Scanner(System.in);
        System.out.println("Please input the number:");
        int num = sc.nextInt();

        System.out.println("Please input the count:");
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The smallest one is: " + min);

 */

import java.util.Random;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Random r = new Random();

        System.out.println("Random Numbers are:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(61) + 20;
            System.out.println(arr[i]);

        }
    }
}

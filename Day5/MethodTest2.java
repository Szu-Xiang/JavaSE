package Test;

/*
    需求：带返回值，输出两个数中较大数。
 */

import java.util.Scanner;

public class MethodTest2 {
    public static void main(String[] args) {
        //调用方法
        System.out.println("Please enter two numbers, the bigger one will be left.");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int max = getMax(num1, num2);
        System.out.println("The bigger one is: " + max);

    }
    public static int getMax(int num1, int num2){
        if(num1 > num2){
            return num1;
        }else{
            return num2;
        }

    }
}

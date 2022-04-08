package Test;

/*
    新需求：键盘录入三个数，输出最大值，最小值和中间值，并从小到大输出。
 */

import java.util.Scanner;
public class TernaryTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter three numbers:");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int higher = Math.max(num1, num2);
        int highest = Math.max(higher, num3);

        int lower = Math.min(num1, num2);
        int lowest = Math.min(lower, num3);

        int sum = num1 + num2 + num3;

        System.out.println(lowest);
        System.out.println(sum - lowest - highest);
        System.out.println(highest);
    }
}

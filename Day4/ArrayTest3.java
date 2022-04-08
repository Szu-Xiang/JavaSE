package Test;

import java.util.Random;
import java.util.Scanner;

/*
    需求：随机生成10个1-100的数，求最小值
 */
public class ArrayTest3 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the elements number：");
        int num = sc.nextInt();
        System.out.println("Produce the following " + num + " elements:");
        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
            System.out.println(arr[i]);
        }

        int min = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if(arr[j] < min){
                min = arr[j];
            }
        }
        System.out.println("The smallest one is: " + min);

    }
}

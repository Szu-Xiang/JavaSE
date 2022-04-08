package Test;

import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //初始化数组
        int[] arr = new int[5];

        //填充数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please enter No."+ (i+1) + " grade:");
            arr[i] = sc.nextInt();
        }

        //求最大值
        int max = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] > max){
                max = arr[j];
            }
        }
        System.out.println("The highest score is: " + max);
    }
}

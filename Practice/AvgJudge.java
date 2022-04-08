/*
    需求：6个评委打分，范围在[0，100]，去掉一个最高分和一个最低分，求平均得分。
 */

import java.util.Scanner;

public class AvgJudge {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);

        System.out.println("You will input 6 grades.");
        System.out.println();

        int max = 0;
        int min = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Please input No." + (i + 1) + "grade:");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }

        min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }

        int grade = sum - max - min;
        int score = grade / 4 ;
        System.out.println("Your score is: " + score);
    }
}

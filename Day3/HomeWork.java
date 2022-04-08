package Test;

import java.util.Scanner;
public class HomeWork {
    public static void main(String[] args) {
        for (int i = 1; i < 7; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your grade:");
            int grade = sc.nextInt();

            if(grade >= 90 && grade < 100){
                System.out.println("Excellent");
            }else if (grade >= 80 && grade < 90){
                System.out.println("Great");
            }else if (grade >= 70 && grade < 80){
                System.out.println("Good");
            }else if (grade >= 60 && grade < 70){
                System.out.println("Pass");
            }else if (grade < 60){
                System.out.println("Failed");
            }
        }

    }
}

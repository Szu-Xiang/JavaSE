package Test;

import java.util.Scanner;

public class MethodTest1 {
    public static void main(String[] args) {
        System.out.println("Pleas enter two numbers, the bigger one will left");
        //调用方法
        getMax();
    }
    public static void getMax(){
        Scanner sc  = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 < num2){
            System.out.println("The bigger one is: " + num2);
        }else{
            System.out.println("The bigger one is: " + num1);
        }
    }
}

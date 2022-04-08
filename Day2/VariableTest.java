package Test2.Demo;
/*
       输入三位数，求每位数字相加的和，比如：123，和为6
 */
import java.util.Scanner;
public class VariableTest {
    public static void main(String[] args) {
        System.out.println("Please enter a three-digit number：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num>999){
            System.out.println("Wrong input");
        }
        else{
            int a = num / 100;  //百位
            int b = num / 10 % 10;  //十位
            int c = num % 10;   //个位

            int sum = a + b + c;
            System.out.println("The sum is:");
            System.out.println(sum);
        }
    }
}

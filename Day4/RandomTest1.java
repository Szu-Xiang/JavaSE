package Test;

/*
    随机生成1～100中的一个数字，猜中为止。
 */

import java.util.Random;
import java.util.Scanner;
public class RandomTest1 {
    public static void main(String[] args) {
        Random r = new Random();
        int x = r.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number");

        while(true){
            int num = sc.nextInt();
            if (num == x){
                System.out.println("Congratulations, you got it!");
                break;
            }else if (num > x){
                System.out.println("The number is smaller than yours");
            }else if (num < x){
                System.out.println("The number is bigger than yours");
            }
        }
    }
}

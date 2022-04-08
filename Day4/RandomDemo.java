package Demo;

/*
    随机生成一个数，用户输入数字，猜中为止，猜大则提示大，反之亦然。
 */

import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();
        // output a number betwwen 1~100
        int x = r.nextInt(100) + 1;
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("PLease enter your number:");
            int num = sc.nextInt();
            if (num == x){
                System.out.println("Congratulations, you get it!");
                break;
            }else if (num > x){
                System.out.println("The number is smaller than yours");
            }else if (num < x ){
                System.out.println("The number is bigger than yours");
            }
        }

    }
}

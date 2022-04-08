package Demo;

import java.util.Scanner;
public class TernaryDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter three heights, I can calculate the highest one");
        int height1 = sc.nextInt();
        int height2 = sc.nextInt();
        int height3 = sc.nextInt();

        int higher = Math.max(height1, height2);
        int highest = Math.max(higher, height3);
        System.out.println("The highest one is: " + highest);

    }
}

package Demo;

import java.util.Scanner;
public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();

        switch (week) {
            case 1,2,3,4,5 -> System.out.println("Work Day");
            case 6,7 -> System.out.println("Weekend");
            default -> System.out.println("Illegal input");
        }
    }
}

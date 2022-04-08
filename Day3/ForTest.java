package Test;

import java.util.Scanner;

public class ForTest {
    public static void main(String[] args) {
        //外循环：控制行数
        for (int i = 5; i > 0; i--) {
            //内循环：控制列数
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

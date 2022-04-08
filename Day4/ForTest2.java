package Test;

/*
    需求：打印99乘法表

    1*1=1
    1*2=2   2*2=4
    1*3=3   2*3=6   3*3=9
 */

public class ForTest2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i*j;
                System.out.print(j + "*" + i + "=" + sum + "\t");
            }
            System.out.println();
        }

    }
}

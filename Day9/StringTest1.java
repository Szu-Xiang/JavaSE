package Test;

/*
    需求：已知用户名和密码，模拟用户登录，总共三次机会，登录之后，给出提示
 */

import java.util.Scanner;

public class StringTest1 {
    public static void main(String[] args) {
        String username = "itheima";
        String password = "szughx";

        Scanner sc = new Scanner(System.in);

        int i = 3;
        while(i>0) {
            i--;
            System.out.println("Please input your username:");
            String name = sc.nextLine();

            System.out.println("Please input your password:");
            String pwd = sc.nextLine();

            if(name.equals(username) && pwd.equals(password)) {
                System.out.println("Welcome!");
                break;
            }else if(i > 0){
                System.out.println("Wrong username or password. You still have " + i + " chance(s)");
                System.out.println();
            }else{
                System.out.println();
                System.out.println("You've tried three times. Please try it later.");

            }
        }

    }
}

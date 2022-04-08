/*
    需求：手机选号，尾数为8，支付50元，尾数为4，支付0元，其他尾号，支付20元。
 */

import java.util.Scanner;

public class TelPrice {
    public static void main(String[] args) {
        System.out.println("Please input your phone number:");
        Scanner sc = new Scanner(System.in);
        String tel = sc.nextLine();

        getPrice(tel);


    }
    public static void getPrice(String tel){
        if (tel.length() != 11){
            System.out.println("Illegal Input");
        }else{
            char c = tel.charAt(10);
            int price = 0;

            switch (c){
                case '8':
                    price = 50;
                    System.out.println("You need to pay: " + price);
                    break;
                case '4':
                    price = 0;
                    System.out.println("You need to pay: " + price);
                    break;
                default:
                    price = 20;
                    System.out.println("You need to pay: " + price);
            }
        }


    }


}


package Demo;

/*
    带返回值方法的定义：

        格式：public static 数据类型 方法名（参数）{
                return 数据；
             }

    带返回值方法的调用：
        1：方法名（参数）,直接调用无任何意义。
        2：数据类型 变量名 = 方法名（参数），赋值调用，非常推荐使用。
 */

import java.util.Scanner;

public class MethodDemo3 {
    public static void main(String[] args) {
        System.out.println("Please enter a number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        //调用方法：赋值调用
        //生成方法返回值快捷键：.var
        boolean evenNumber = isEvenNumber(number);
        System.out.println(evenNumber);
    }

    public static boolean isEvenNumber(int number){

        if(number % 2 ==0){
            return true;
        }else{
            return false;
        }
    }
}

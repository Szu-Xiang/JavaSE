package Test;

/*
    隐式转换：小的直接给大的。
    取值范围： byte short int long float double

    快捷键： option + enter 查看错误的解决方案

 */

public class ChangeTest1 {
    public static void main(String[] args) {

        int a = 10;
        double b = a; // b = 10.0
        System.out.println(a);
        System.out.println(b);

        byte m = 3 + 4;
        // Java存在常量优化机制，在编译的时候（javac），就会将3+4=7作为结果，所以m=7。检查7是否在byte取值范围内，否则报错。
        System.out.println(m);

        byte s = (byte) 128;
        System.out.println(s);
    }

}

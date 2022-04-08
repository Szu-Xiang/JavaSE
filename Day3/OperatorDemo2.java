package Demo;

//字符串的拼接

public class OperatorDemo2 {
    public static void main(String[] args) {
        //int a = 10;
        //char c = 'A';
        /*
        System.out.println(a + c);
        System.out.println("it" + "heima");
        System.out.println(666 + "heima");
        System.out.println(1 + 199 + "woshi");
        */

//赋值运算符：隐含了强制类型转换
        /*
        int i = 10;
        i += 20;
        System.out.println(i);
        i *= 2;
        System.out.println(i);
        i /= 4;
        System.out.println(i);
        i %= 2;
        System.out.println(i);
         */

//逻辑运算符 & ^ | !
        int i = 10;
        int j = 20;
        int k = 15;
        System.out.println(i < k && i < j);
        System.out.println((i>k) || (i<j));

//短路运算符 && ｜｜
        int a = 10;
        int b = 20;
        System.out.println((a++) > 200 && (b++) > 200);     //短路 && ，左边条件为false，则右侧不执行, b = 20;
        System.out.println(b);
        System.out.println((a++) > 1 || (b++) < 20);    //短路 ｜｜ ，左边条件为true，则右侧不执行，b = 20;
        System.out.println(b);

        int s = 10;
        double m = 12.3;
        s += m; //强制转换成a的类型，所以22.3会转换成int类型，结果为22。
        System.out.println(s);
    }
}

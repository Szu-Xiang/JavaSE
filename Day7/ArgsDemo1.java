package args;

/*
    基本数据类型

    引用数据类型：数组

    Java是值传递，还是址传递？ -值传递
 */
public class ArgsDemo1 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println(number);
        change(number);
        System.out.println(number);
    }
    public static void change(int number){
        number = 200;//弹出栈，返回主方法后，number仍为100;
    }
}

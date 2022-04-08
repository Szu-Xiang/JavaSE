package Test2.Demo;

    /*
        定义格式：
                数据类型 变量名 = 数据值；

        加断点：
                点哪里：Step Over
                看哪里：
                       Debugger：
                            Frames:程序中哪些方法正在执行。
                            Variables:看到程序中，有哪些变量，以及变量的变化过程。
                       Console:控制台，输出打印内容。

        数据类型：
                1、整数：
                       byte     -128~127
                       short
                       int
                       long     定义需要在数字后加上"L"
                2、小数：
                       float    定义需要在数字后加上"F" (大多数使用double)
                       double
                3、字符
                       char
                4、布尔
                       boolean
     */

public class VariableDemo {//两个单词首字母大写
    public static void main(String[] args) {
        int a = 10, b = 20, c = 40; //一条语句可定义多个变量
        int firstName = 123; //首单词小写，第二个单词首字母大写

        String name = "勾昊翔";
        int age = 24;
        double height = 187.8;
        char gender = 'M';
        boolean marriage = true;

        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
        System.out.println(gender);
        System.out.println(marriage);


    }
}

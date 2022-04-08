package Phone;

/*
    需求：创建Phone对象并使用
 */

import Student.Student;

public class PhoneDemo {
    public static void main(String[] args) {
        //创建对象
        Phone p = new Phone();
        Student s = new Student();//public可以在任意位置访问

        //使用成员变量
        System.out.println(p.brand);//堆内存默认为null
        System.out.println(p.price);//堆内存默认为0

        p.brand = "iPhone";
        p.price = 6488;

        System.out.println(p.brand);
        System.out.println(p.price);

        //使用成员方法
        p.Call();
        p.sendMessage();
    }
}

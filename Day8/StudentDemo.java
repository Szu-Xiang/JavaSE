package Student;

public class StudentDemo {
    public static void main(String[] args) {
        Student xiang = new Student();

        Student s1 = new Student();
        s1.show();

        Student s2 = new Student("勾昊翔", 24);
        s2.show();

        Student s = new Student("张三", 23);//带参构造方法，创建的时候直接赋值，若后期需要修改，则用setXXX即可。
        System.out.println(s.age + " " + s.name);

        /*
        xiang.setAge(30);//空参构造方法，用setXXX进行赋值
        xiang.name = "Gou Haoxiang";

        xiang.getAge();
        System.out.println("My name is: " + xiang.name);


        xiang.print();
        xiang.study();
        xiang.doHomeWork();

         */
    }
}

package Test;

import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //创建集合对象，用于存储学生数据
        ArrayList<Student> array = new ArrayList<Student>();

        Scanner sc = new Scanner(System.in);

        //command + option + t
        while (true) {
            System.out.println("-------Welcome to the Student Manager System-------");
            System.out.println("1. Add a Student.");//添加学生
            System.out.println("2. Remove a Student.");//删除学生
            System.out.println("3. Set a Student.");//修改学生
            System.out.println("4. Get a Student.");//查看学生
            System.out.println("5. Exit.");
            System.out.println("Please input your choice:");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    //System.out.println("Add a Student:");
                    addStudent(array);
                    break;
                case 2:
                    //System.out.println("Remove a Student:");
                    removeStudent(array);
                    break;
                case 3:
                    //System.out.println("Set a Student:");
                    setStudent(array);
                    break;
                case 4:
                    //System.out.println("Get a Student:");
                    findAllStudent(array);
                    break;
                case 5:
                    System.out.println("Exit, thank you!");
                    System.exit(0); //终止JVM虚拟机
                    break;
                default:
                    System.out.println("Illegal Input, please check it.");
                    System.out.println();
            }
        }

    }

    //添加学生方法
    public static void addStudent(ArrayList<Student> array) {
        //提示要输入的信息

            Scanner sc = new Scanner(System.in);

            System.out.println("Please add a student's id:");
            String id = sc.nextLine();
            System.out.println("Please add a student's name:");
            String name = sc.nextLine();
            System.out.println("Please add a student's age:");
            String age = sc.nextLine();
            System.out.println("Please add a student's birthday:");
            String birthday = sc.nextLine();

            //创建学生对象，赋值给学生对象
            Student s = new Student();
            s.setId(id);
            s.setName(name);
            s.setAge(age);
            s.setBirthday(birthday);
            //将学生添加到集合中
                array.add(s);

            //给出添加成功的提示
            System.out.println("A student is added to the system.");
            System.out.println();

    }

    //删除学生方法
    public static void removeStudent(ArrayList<Student> array) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the Student's id that you want to remove");
        String sid = sc.nextLine();

        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            if (s.getId().equals(sid)) {
                array.remove(i);
                System.out.println("The student is removed.");
                break;
            } else {
                System.out.println("The id is wrong, please check it.");
            }
        }
        System.out.println();

    }

    //查看学生方法
    public static void findAllStudent(ArrayList<Student> array) {
        if(array.size() == 0){
            System.out.println("No student.Please input a student first.");
            return;//程序无需向下执行
        } else {
            //显示表头信息
            System.out.println("Number     \tName\t     Age\t       Birthday");

            //将集合中数据取出，按照对应格式显示学生信息，年龄补充-year-old
            for (int i = 0; i < array.size(); i++) {
                Student s = array.get(i);
                System.out.println(s.getId() + " \t" + s.getName() + " \t" + s.getAge() + "-year-old" + "   \t" + s.getBirthday());
            }
        }
        System.out.println();
    }

    //修改学生方法
    public static void setStudent(ArrayList<Student> array) {
        //显示提示信息
        System.out.println("Please input the id that your want to change:");
        Scanner sc = new Scanner(System.in);
        //键盘录入学生号
        System.out.println("Please input the student's number:");
        String sid = sc.nextLine();

        System.out.println("Please input new name:");
        String name = sc.nextLine();
        System.out.println("Please input new age:");
        String age = sc.nextLine();
        System.out.println("Please input new birthday:");
        String birthday = sc.nextLine();

        Student s = new Student();
        s.setId(sid);
        s.setName(name);
        s.setAge(age);
        s.setBirthday(birthday);

        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            if(student.getId().equals(sid)) {
                array.set(i, s);
                break;
            }
        }
        //修改成功提示：
        System.out.println("A student's information is updated.");
    }
}

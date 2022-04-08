package Student;

/*
       需求：定义一个学生类，成员有年龄和姓名，方法有做作业和学习。
 */
public class Student {
    //属性：姓名，身高，年龄，体重...
    //行为：学习、做作业...

    String name;
    int age;

    //构造方法，完成数据初始化
    public Student() {
    }

    //构造方法，带参数
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {

        System.out.println(name + "+" + age);
    }

    /*
    //封装，提供set/get方法
    public void setAge(int a){

        age = a;
    }

    public int getAge(){

        return age;
    }

    public void print(){

        System.out.println(age);
    }

    public void study(){

        System.out.println("Good Good Study!");
    }

    public void doHomeWork(){
        System.out.println("键盘敲烂，月薪过万！");

    }

     */


}

package Demo;

/*
    动态初始化数组：
            格式：    int[] arr = new int [length];
            Java常用初始化格式：数据类型[] 数组名 = {};

    静态初始化数组：
            格式：    int[] arr = {11,22,33};
            内存分配：栈、堆、方法区；

    方法区：.class文件加载时所进入的内存

    栈内存：方法运行时所进入的内存             堆内存：new出来的东西，通过new关键字：开辟空间，产生地址，如下方的0x0011
    int[] arr 0x0011（此地址由堆内存交给）    因为new的是数组，数组长度为5，将空间划分出5块连续大小相同的内存空间：分配索引，
                                          先产生地址：0x0011 {100,200,300,400,500}
                                           0    100
                                           1    200
                                           2    300
                                           3    400
                                           4    500

 */

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] arr = new int [3]; //初始化
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;

        System.out.println(arr);
        System.out.println(arr[0]);

        int[] arr2 = arr;
        arr2[0] = 111;
        arr2[1] = 222;
        arr2[2] = 333;

        System.out.println(arr2);
        System.out.println(arr[0]);
        System.out.println(arr2[0]);


    }
}

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
                                           


静态初始化数组：初始化每个数组元素的初始值，由系统决定数组长度。
            格式： int[] arr = {数据1、数据2、数据3...}


    索引越界：访问数组中不存在的索引元素，造成索引越界。
            ArrayIndexOutOfBoundsException

    空指针异常：访问的数组已经不再指向堆内存的数据。
            NullPointerException

    null：空值，引用数据类型的默认值，表示不指向任何有效对象。

    数组遍历应用场景：
    
    

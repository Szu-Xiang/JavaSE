package Demo;

/*
    静态初始化数组：初始化每个数组元素的初始值，由系统决定数组长度。
            格式： int[] arr = {数据1、数据2、数据3...}


    索引越界：访问数组中不存在的索引元素，造成索引越界。
            ArrayIndexOutOfBoundsException

    空指针异常：访问的数组已经不再指向堆内存的数据。
            NullPointerException

    null：空值，引用数据类型的默认值，表示不指向任何有效对象。

    数组遍历应用场景：

 */

public class ArrayDemo2 {
    public static void main(String[] args) {
        //初始化简化版本
        int[] arr = {11,22,33,44,55};
        int sum = 0;
        //遍历数组，打印所有元素
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 !=0){
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}

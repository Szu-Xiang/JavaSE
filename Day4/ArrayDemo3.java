package Demo;

/*
    动态初始化数组：
                    int[] arr = new int[length];


    两种初始化的应用场景：

        1、静态初始化：需要操作的数据，已经给出。如：已知学生成绩为：...求最高分。

        2、动态初始化：只知道存储几个元素，不明确具体数据。如：键盘录入5个成绩，求最高分。
 */

public class ArrayDemo3 {
    public static void main(String[] args) {

        String [] arr = new String[3];//3为数组的长度

        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

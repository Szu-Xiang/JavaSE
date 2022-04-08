/*
    需求：给定一个数组，反转其中的元素

    分析：开辟临时空间，交换相应位置的元素：
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
 */

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {11,33,55,22,44,66};

        Reverse(arr);

    }
    public static void Reverse(int[] arr){
        //定义数组起始位置
        int start = 0;
        //定义数组结束位置
        int end = arr.length - 1;
        //开辟临时空间
        int temp;

        //设置两个标识，从前向后和从后向前遍历，均到中间位置停止。
        for(start = 0, end = arr.length - 1 ; start < end; start++, end--){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        //遍历输出数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


    }

}

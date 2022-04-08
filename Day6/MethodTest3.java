/*
    设计一个方法，遍历输出数组。
    格式： {11， 22， 33， 44， 55}

    抽取方法的快捷键：选中抽取的部分，command+option+m
 */
package Test;

public class MethodTest3 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        Array(arr);

        int[] arr2 = {33,44,55,66,77};
        Array(arr2);

    }

    public static void Array(int[] arr){
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            if(i != arr.length - 1){
                System.out.print(arr[i] + ", ");
            }else {
                System.out.println(arr[i] + "}");
            }
        }

    }
}

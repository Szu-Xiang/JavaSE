/*
    需求：请在 Solution 类中定义一个非静态方法 copy()，
    用来把任意参数类型的一个数组中的数据安全地复制到相应类型的另一个数组中，
    并且不用指定方法的返回值。
 */

import java.util.*;
public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr1 = {11,22,33,44,55};
        int[] arr2 = new int[10];
        arrayCopy(arr1, arr2);

    }
    public static void arrayCopy(int[] arr1, int[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        System.out.print("[");
        for (int i = 0; i < arr1.length; i++) {
            if(i != arr1.length - 1){
                System.out.print(arr2[i] + ", ");
            }else{
                System.out.println(arr2[i] + "]");
            }
        }
    }
}

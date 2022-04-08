/*
    需求：设计一个方法， 找出数组最大值和最小值

    若方法返回多个值，则将其存在数组中，将整个数组返回即可。
 */

package Test;

public class MethodTest4 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        getMaxandMin(arr);
    }
    public static int[] getMaxandMin(int[] arr){

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }

        int[] result = {max, min};
        return result;

    }

}

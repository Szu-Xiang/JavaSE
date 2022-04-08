package Test;
/*
    定义一个方法，反转数组
 */
public class ArrayReverse1 {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        reverse(arr);
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            if(i != arr.length - 1){
                System.out.print(arr[i] + ", ");
            }else{
                System.out.println(arr[i] + "}");
            }

        }
    }

    public static void reverse(int[] arr){

        int temp;
        for(int start = 0, end = arr.length - 1; start < end; start++, end--){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }
}

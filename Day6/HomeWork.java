package Test;

/*
    需求：定义一个方法， 找出三个整数的最大值

    public static int getMax(int a, int b, int c){
        int more = Math.max(a, b);
        int max = Math.max(more, c);

        return max;
    }
 */
public class HomeWork {
    public static void main(String[] args) {
        int[] arr = {11,22,33};
        Array(arr);
    }
    public static void Array(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i != arr.length - 1){
                System.out.print(arr[i] + ", ");
            }else{
                System.out.println(arr[i] + "]");
            }
        }
    }

}

package Test;

/*
    需求：找出数组中的最大值、最小值、平均值、总和
 */

public class ArrayTest1 {
    public static void main(String[] args) {
        double max;
        double[] arr = {112,41,5.2,1,76.5,36.5,8.89,99.3};
        max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("The biggest one is: " + max);

        double min = arr[0];
        for(int j = 1; j < arr.length; j++){
            if(arr[j] < min){
                min = arr[j];
            }
        }
        System.out.println("The smallest one is: " + min);

        double sum = 0;
        for(int k = 0; k < arr.length; k++) {
            sum += arr[k];
        }
        System.out.println("The sum is: " + sum);

        double avg = sum / (arr.length) * 1.0;
        System.out.println("The average is: " + avg);

    }
}

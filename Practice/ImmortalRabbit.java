/*
    需求：有一对兔子，到出生第三个月之后就会生一对兔子，生出来的兔子也满足此规律。问：寿命无限，20月会有多少对兔子？

    分析：1月：1     2月：1        3月：2       4月：3        5月：5
 */
public class ImmortalRabbit {
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
            System.out.println(arr[i]);
        }
        System.out.println(arr[19]);
    }
}

package Demo;

/*
    二维数组的遍历
 */

public class ArrayDemo4 {
    public static void main(String[] args) {
        int[][] arr = {
                {11,22,33},
                {44,55,66}
        };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            //arr[i] :每一个一维数组
            for (int j = 0; j < arr[i].length; j++) {
                //arr[i]的基础上，继续遍历
                System.out.println(arr[i][j]);
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }
}

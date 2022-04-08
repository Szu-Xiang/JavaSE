package Demo;

/*
    二维数组的动态初始化：
        格式： int[][] arr = new int[m][n];

        m:二维数组可以存放多少个一维数组；
        n:每个一维数组中，存放多少个元素；
 */

public class ArrayDemo5 {
    public static void main(String[] args) {
        int[][] arr = new int[2][2];

        /*
        arr[0][3] = 88;
        System.out.println(arr[0][3]);//越界出错
         */

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}

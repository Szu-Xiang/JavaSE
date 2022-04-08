/*
    需求：定义两个数组，比较其中的所有元素，若相同返回True，不相同则返回False
 */
public class ArrayCompare {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        int[] arr2 = {11,22,33,44,55};

        boolean flag = Compare(arr, arr2);
        System.out.println(flag);

    }
    public static boolean Compare(int[] arr, int[] arr2){
        if(arr.length != arr2.length){
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}

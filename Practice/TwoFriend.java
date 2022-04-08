import java.util.*;

/*
    需求：数字2的朋友，如果一个数是2的若干次幂之和，则输出Yes，否则输出No。
    如：3，Yes；11，No
 */
public class TwoFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = isFriend(num);
        System.out.println(flag);
    }
    public static boolean isFriend(int n){
        for(int i = 2;;i *= 2){
            for(int j =1; j<i; j *= 2){
                if(i+j == n){
                    return true;
                }else if (i + j > n){
                    return false;
                }
            }
            if(i > n){
                return false;
            }
        }
    }
}

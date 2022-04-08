/*
    需求：输出1000以内的完数，一个数等于因子之和即为完数。
 */
public class GetNum {
    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {
            //储存因子之和
            int sum = 0;
            for(int j = 1; j <= i/2; j++){
                if(i % j ==0){
                    sum += j;
                }
            }
            if(sum == i){
                System.out.println(i);
            }
        }

    }
}

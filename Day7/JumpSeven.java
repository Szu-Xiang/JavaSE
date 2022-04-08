package Test;

/*
    1~100之间，数字中包含7以及7的倍数
 */
public class JumpSeven {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if(i % 7 ==0 || i / 10 == 7 || i % 10 == 7){
                System.out.println("Jump");
            }else{
                System.out.println(i);
            }
        }
    }
}

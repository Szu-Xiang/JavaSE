package Demo;

/*
    定义格式：
        public static void 方法名(){
                //方法体；
    调用格式：
        方法名();
 */

public class MethodDemo1 {
    public static void main(String[] args) {
        // 调用方法
        isEvenNumber();
    }
    public static void isEvenNumber(){
        int num = 10;
        if (num % 2 ==0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}

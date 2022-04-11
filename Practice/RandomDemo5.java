import java.util.*;

/*
    需求：创建长度为10的数组，存入10个范围在1～100的随机数，键盘录入数据，打印出现次数，未出现则打印"未中奖"
 */

public class RandomDemo5 {
    public static void main(String[] args) {
        System.out.println("请你输入数组长度：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int[] arr = new int[num];
        getNum(arr);

    }
    public static void getNum(int[] arr) {

        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
        }

        int flag = 0;//标记变量，判断是否中奖
        int count = 0;//中奖计数
        System.out.println("请输入一个数字：");
        int number = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {

            if(number == arr[i]) {
                flag = 1;
                count++;
            }
        }
        if(flag == 1) {
            System.out.println(count);
        } else {
            System.out.println("很遗憾，您未中奖");
        }


    }
}

import java.util.*;
/*
    需求：创建长度为10的集合，存入10个范围在1～100的随机数，键盘录入数据，打印出现次数，未出现则打印"未中奖"
 */
public class ArrayDemo5 {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        getNum(list);

    }

    public static void getNum(ArrayList<Integer> list) {

        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        while (list.size() < 10) {
            int num = r.nextInt(100) + 1;
            list.add(num);//向队列中添加元素
        }

        //尝试次数过多，只好先打印出随机数再测试中奖情况...
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1){
                System.out.println(list.get(i));
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }

        int flag = 0;//标记变量，判断是否中奖
        int count = 0;//中奖计数
        System.out.println("请输入一个数字：");
        int number = sc.nextInt();
        for (int i = 0; i < list.size(); i++) {
            if(number == list.get(i)) {
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



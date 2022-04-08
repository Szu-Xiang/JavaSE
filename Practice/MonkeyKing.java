/*
    15只猴子，1-7报数，报到7即淘汰，直到最后剩下一只猴子，求这是哪只猴子？
 */
public class MonkeyKing {
    public static void main(String[] args) {
        boolean[] b = new boolean[15];
        for (int i = 0; i < b.length; i++) {
            b[i] = true;//设置所有猴子为存活状态
        }
        int num = 0;//报数
        int monkeyLeft = 15;//存活猴子数量
        int index = 0;//定义数组下标？？？

        while(monkeyLeft > 1){
            if(b[index]){
                num++;
                if(num ==7){
                    b[index] = false;
                    monkeyLeft--;
                    num = 0;
                }
            }
            index++;
            //因为围城了一个圈，所以15号猴子的下一位是1号猴子，数组下标为0，index重置为0;
            if(index == 15){
                index = 0;
            }
        }

        for (int i = 0; i < b.length; i++) {
            if(b[i]){
                System.out.println(i + 1);
            }
        }
    }

}

package Test;
/*
    需求：15只猴子，1～7报数，到7淘汰，重新报数，求剩下的猴子的起始编号？
 */
public class MonkeyKing1 {
    public static void main(String[] args) {
        boolean b[] = new boolean[15];
        //将每一只猴子起始状态设为存活，true
        for (int i = 0; i < b.length; i++) {
            b[i] = true;
        }
        int num = 0;//报数
        int monkeyLeft = 15;//剩余猴子数量
        int index = 0;//数组下标

        while(monkeyLeft > 1){
            //若存活，则执行
            if(b[index]){
                num++;
                if(num % 7 ==0){
                    b[index] = false;//报7则淘汰
                    num = 0;//报数重置
                    monkeyLeft--;
                }
            }
            index++;
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

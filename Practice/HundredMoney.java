
/*
     需求：公鸡5元，母鸡3元，小鸡三个一元，百钱买百鸡，各有多少只？

     分析：令鸡公x，鸡母y，小鸡为z；则：x+y+z = 100，x<20,y<33,z = 100-x-y
 */

public class HundredMoney {
    public static void main(String[] args) {

        for (int x = 0; x <= 20; x++) {
            for (int y = 0; y <= 33; y++) {
                int z = 100 - x - y;

                if(z % 3 ==0 && 5*x + 3*y + z/3 ==100){
                    System.out.println("公鸡：" + x + " 母鸡： " + y + " 小鸡：" + z);
                }
            }
        }
    }

}

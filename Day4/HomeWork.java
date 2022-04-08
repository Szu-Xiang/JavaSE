package Test;

/*
    1、在中国历法中有十二生肖年份,2019年是己亥猪年.
    请在控制台输出从1949年(包含)到2019年(包含)中所有是猪年的年份。

    思路：在1949-2019进行for循环，跟2019差值为12倍数的年份即为猪年。
            for(int i = 1949; i <= 2019; i++){
                    if((2019 - i) % 12 == 0 ){
                        System.out.println(i);
                    }
             }
    2、输出1988～2019之间的闰年

    for(int i = 1988; i <= 2019; i++){
            if(i % 4 ==0 && i % 100 !=0 || i % 400 ==0){
                System.out.println(i);
            }
        }
 */
public class HomeWork {
    public static void main(String[] args) {
        for(int i = 1949; i <= 2019; i++){
            if((2019 - i) % 12 == 0 ){
                System.out.println(i);
            }
        }
    }
}

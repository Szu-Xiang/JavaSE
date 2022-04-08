package Demo;

/*
    带参数方法的定义：

        格式（单个参数）：public static void 方法名(){...}
        范例（单个参数）：public static void isEvenNumber(int num1){...}

    调用格式：
        格式（单个参数）：方法名(变量){...}
        范例（单个参数）：isEvenNumber(5){...}

    带参数方法的定义：

        格式（多个参数）：public static void 方法名(){...}
        范例（多个参数）：public static void getMax(int num1, int num2){...}

    调用格式：
        格式（多个参数）：方法名(变量名1， 变量名2){...}
        范例（多个参数）：isEvenNumber(5，10){...}
 */

public class MethodDemo2 {
    public static void main(String[] args) {
        isEvenNumber(19);
    }
    public static void isEvenNumber(int number){
        for (int i = 0; i < number; i++) {
            System.out.println("Hello World");
        }
    }
}

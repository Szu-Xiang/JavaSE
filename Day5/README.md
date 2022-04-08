方法：

定义格式：
        public static void 方法名(){
                //方法体；
    调用格式：
        方法名();
        
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
        


带返回值方法的定义：

        格式：public static 数据类型 方法名（参数）{
                return 数据；
             }

    带返回值方法的调用：
        1：方法名（参数）,直接调用无任何意义。
        2：数据类型 变量名 = 方法名（参数），赋值调用，非常推荐使用。

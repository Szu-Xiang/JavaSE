package Demo;

public class StringDemo2 {
    public static void main(String[] args) {
        char[] chs = {'a', 'b', 'c'};
        String s1 = new String(chs);
        String s2 = new String(chs);

        String s3 = "abc";
        String s4 = "abc";

        //"=="比较的是地址是否相同，这里s1、s2均是new出来的，所以地址不同
        System.out.println(s1 == s2);
        //true，双引号直接创建，存储在常量池中，在s4创建时常量池已有"abc"，所以返回true
        System.out.println(s3 == s4);
        //调用equals比较是比较内容，内容相等则返回true
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));
    }
}

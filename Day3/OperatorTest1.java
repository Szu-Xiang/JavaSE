package Test;

public class OperatorTest1 {
    public static void main(String[] args) {
        int x = 10;
        int y = ++x; //先自增，再操作，x = y =11;
        int z = y--; //先操作，再自减，z = 11, y = 10;

        //System.out.println("x=" + x);
        //System.out.println("y=" + y);
        //System.out.println("z=" + z);

        int a =3;
        int b = (++a) + (a++) + (a*10); // b = 4 + 4 + 50 = 58;
        System.out.println("a=" + a); // a = 5;
        System.out.println("b=" + b);

    }
}

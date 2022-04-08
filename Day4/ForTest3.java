package Test;

public class ForTest3 {
    public static void main(String[] args) {
        double paper = 0.1;
        double mountain = 8844430;
        int count = 0;

        while(paper < mountain){
            count++;
            paper *= 2;
        }
        System.out.println(count);
    }
}

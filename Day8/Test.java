package Water;

public class Test {
    public static void main(String[] args) {
        WaterDispenser machine = new WaterDispenser("美的", "红色",
                5, "手动净水");

        machine.show();

        int capacity = machine.getCapacity();
        if(capacity > 3){
            System.out.println("容量大于3L");
        }
    }
}

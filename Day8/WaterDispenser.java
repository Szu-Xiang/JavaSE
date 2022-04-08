package Water;

public class WaterDispenser {
    private String brand;
    private String color;
    private int capacity;
    private String model;


    public WaterDispenser() {
    }

    public WaterDispenser(String brand, String color, int capacity, String model) {
        this.brand = brand;
        this.color = color;
        this.capacity = capacity;
        this.model = model;
    }

    /**
     * 获取
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 获取
     * @return capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * 设置
     * @param capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * 获取
     * @return model
     */
    public String getModel() {
        return model;
    }

    /**
     * 设置
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    public void show(){
        System.out.println("品牌为：" + brand + ", 颜色为："
                + color + ", 容量为：" + capacity + "L, 模式为：" + model);
    }
}

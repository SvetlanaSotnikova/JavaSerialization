public class Car {
    public String name;
    private String price;
    private String endType;
    private String engPower;
    public int maxSpeed;

    public Car(String name) {
        this.name = name;
        this.endType = "VS";
        this.engPower = "123";
        this.price = "1000000";
        this.maxSpeed = 290;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

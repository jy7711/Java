package Polymorphic.PolymorphicTest3;

public class Vechicle {

    private String brand;
    private double speed;

    public Vechicle() {}

    public Vechicle(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void move() {
        System.out.println(brand + "的交通工具正在以" + speed + "km/h的速度移动");
    }
}

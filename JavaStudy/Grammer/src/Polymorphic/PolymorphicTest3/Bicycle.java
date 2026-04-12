package Polymorphic.PolymorphicTest3;

public class Bicycle extends Vechicle {

    public Bicycle() {}

    public Bicycle(String brand, double speed) {
        super(brand, speed);
    }

    @Override
    public void move() {
        System.out.println(getBrand() + "的自行车正在以" + getSpeed() + "km/h的速度移动");
    }

    public void ringbell() {
        System.out.println("铃铃铃");
    }
}

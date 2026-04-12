package Abstract;

public class Cat extends Animal{

    public Cat() {}

    public Cat(String name, String colour) {
        super(name, colour);
    }


    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}

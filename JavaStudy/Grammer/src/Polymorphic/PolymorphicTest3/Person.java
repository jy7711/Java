package Polymorphic.PolymorphicTest3;

public class Person {

    private String name;
    private int age;
    private String gender;

    public Person() {}

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    public void drive(Vechicle vechicle) {
        //正在行驶
        vechicle.move();
        //响铃 / 鸣笛
        //判断一下传递过来的是不是自行车
        if (vechicle instanceof Bicycle) {
            ((Bicycle)vechicle).ringbell();
        }
        else if (vechicle instanceof Car) {
            ((Car)vechicle).honk();
        }
        else {
            System.out.println("没有这个类型");
        }

    }
}

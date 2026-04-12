package oopStudent;

public class Student {
    //姓名， 年龄， 身高， 体重
    private String name;
    private int age;
    private int height;
    private int weight;
    static int tired;

    //set是从外界读取， get是从class Student调用
    void setName(String name) {
        //Student里的name 赋值为 setName 里面传的值
        this.name = name;
    }

    String getName() {
        // 返回Student里面的name
        return name;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return age;
    }

    void setHeight(int height) {
        this.height = height;
    }

    int getHeight() {
        return height;
    }

    void setWeight(int weight) {
        this.weight = weight;
    }

    int getWeight() {
        return weight;
    }

    void setTired(int tired) {
        this.tired = tired;
    }

    int getTired() {
        return tired;
    }

    void Study() {
        tired++;
        System.out.println( name +"正在学习");
        if (tired > 1) {
            System.out.println(name + "学习不成， 累死了， （悲）");
        }
    }

    void Play() {
        tired++;
        if (tired < 1) {
            System.out.println(name +"正在玩");
            System.out.println(name + "玩 ！ 呼呼呼");
            if (tired >= 2) System.out.println(name + "玩， 累死了， （悲）");
        }
        else {
            System.out.println("快醒醒起来玩");
        }
    }

    void Sleep() {
        if (tired > 1) {
            System.out.println(name +"复活了喵");
        }
        System.out.println("HP up to 100!");
        tired = 0;
    }

    //信息描述 ：
    void informationOutput() {
        System.out.println(name + "的个人信息：");
        System.out.println("年龄 ： " + age + "岁");
        System.out.println("身高 ： " + height + "cm");
        System.out.println("体重 ： " + weight + "kg");
        System.out.println("当前疲劳值 ： " + tired + "疲劳值过高会有不好的事情发生");
        System.out.println("---------GAME START--------\n\n");
    }

}

package Innerclass.InnerclassTest2;

public class Outer {

    String name;

    class Inner {

    }

    public Inner getInstance() {
        return new Inner();
    }
}

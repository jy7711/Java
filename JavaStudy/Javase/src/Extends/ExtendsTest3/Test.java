package Extends.ExtendsTest3;

public class Test {
    static void main() {
        //情况一： 外界创建子类的对象， 并调用方法
        Test t = new Test();
        Zii z = t.new Zii();
        z.lunch();
    }

    class Fu {
        public void eat() {
            System.out.println("吃米饭， 吃菜~");
        }

        public void drink() {
            System.out.println("喝开水");
        }
    }

    class Zii extends Fu {
        //情况二 ： 本类中， 调用其他方法
        public void lunch() {
            eat(); // this.eat();
            drink();// this.drink();
            System.out.println("\n-------------------");
            super.eat();
            super.drink();
        }
    }
}

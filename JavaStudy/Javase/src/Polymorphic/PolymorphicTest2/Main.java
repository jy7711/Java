package Polymorphic.PolymorphicTest2;

public class Main {

    static void main() {
        /*
            变量调用 ：
                    编译看左边， 运行也看左边
            方法调用 ：
                    编译看左边， 运行看右边
         */

        //利用多态方式创建对象
        Fu f = new Zi();
        // 调用成员变量 ： 编译看左边， 运行也看左边
        // 编译看左边 ： 看父类有没有这个变量， 如果有编译成功
        //                              如果没有编译失败

        System.out.println(f.name); //Fu
        System.out.println(((Zi)f).name); // Zi
        System.out.println(f.name); //Fu

        //调用成员方法 ： 编译看左边， 运行看右边
        // 编译看左边 ： 看父类当中有没有这个方法， 如果没有代码报错
        // 运行看右边 ： 在代码真的运行的时候， 运行的是子类里面的方法
        //            如果子类没有重写父类里面的方法， 使用的还是父类

        f.show();//子类重写的show方法被调用了

        f.fushow();//父类的fushow方法被调用了

        //弊端 ： 不能调用子类的特有方法
        //f.zishow(); 这个会报错
        ((Zi)f).ziShow(); // 这个不会
        //子类的ziShow方法被调用了
    }

}

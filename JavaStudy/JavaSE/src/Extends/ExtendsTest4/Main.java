package Extends.ExtendsTest4;

public class Main {
    static void main() {
        /*
        第一代手机 ：
            功能 ： 打电话
        第二代手机 ：
            功能 ： 打电话， 发短信
        第三代手机 ：
            功能 ： 打电话升级为视频通话， 发短信， 打游戏
         */

        FIrstGenerationPhone phone1 = new FIrstGenerationPhone();
        phone1.call();

        System.out.println("\n----------------------");

        SecondGenerationPhone phone2 = new SecondGenerationPhone();
        phone2.call();
        phone2.sendMessage();

        System.out.println("\n----------------------");

        ThirdGenerationPhone phone3 = new ThirdGenerationPhone();
        phone3.call();
        phone3.sendMessage();
        phone3.playGame();
    }
}
/*
继承中的成员特点 —— 成员方法
    书写原则 ： 把多个子类中共性的成员方法抽取到父类中
    调用原则 ： 就近原则

方法的重写
    方法重写 ： 在子类中， 把父类的方法重写一遍， 方法申明保持一致
    使用场景 ： 如果父类的方法不能满足子类的要求了， 子类可以把该方法再重写一遍
 */

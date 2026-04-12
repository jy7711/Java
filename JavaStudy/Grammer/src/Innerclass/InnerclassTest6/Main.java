package Innerclass.InnerclassTest6;

public class Main {

    static void main() {
        //匿名内部类
        Swim s1 = new Swim() {
            @Override
            public void swim() {
                System.out.println("正在游泳");
            }
        };

        //lambda表达式
        Swim s2 = () -> System.out.println("正在游泳");
        goSwimming(s1);
    }

    public static void goSwimming(Swim s) {
        s.swim();
    }
}
/*
1. 什么是匿名内部类 ？
    隐藏了名字的内部类， 可以写在成员位置， 也可以写在局部位置

2. 匿名内部类的格式 ？

    new 类名或者接口名() {
        重写方法;
    };

3. 匿名内部类等价于
    没有名字的java类 + 实现接口/继承类 + 重写方法 + 创建对象

4. 使用场景
    如果实现类只使用一次， 就可以用匿名内部类简化代码
    Lambda表达式的前置知识点

1. lambda表达式的基本作用
        简化函数式接口的匿名内部类的写法

2. lambda表达式有什么使用前提
        必须是接口的匿名内部类， 接口中只能有一个抽象方法

3. lambda的好处 ？
        lambda是一个匿名函数， 我们可以把lambda表达式理解为一段
        可以传递的的代码， 它可以写出更简洁， 更灵活的代码， 作为一种更紧
        凑的代码风格， 使java语言表达能力得到了提升

 */

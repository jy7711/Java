package Extends.ExtendsTest2;

public class Test {

    public static void main(String []args) {
        Zi z = new Zi();
        z.ziShow();
    }

    static class Ye {
        String name = "Ye"; //这里无法访问
    }
    static class Fu {
        String name = "Fu";
    }

    static class Zi extends Fu {
        String name = "Zi";

        public void ziShow() {
            String name = "ziShow";
            System.out.println(name); //ziShow
            System.out.println(this.name); //Zi
            System.out.println(super.name); // Fu
        }
    }
}
/*
继承中成员变量的书写原则 ： 抽取共性

继承中成员变量访问特点 ： 就近原则
    现在局部位置找， 本类成员位置找， 父类成员位置找， 逐级往上

如果出现了重名的成员变量怎么办？
    System.out.println(name);       //从局部位置开始往上找
    System.out.println(this.name);  //从本类成员位置开始往上找
    System.out.println(super.name); //从父类成员位置开始往上找
 */

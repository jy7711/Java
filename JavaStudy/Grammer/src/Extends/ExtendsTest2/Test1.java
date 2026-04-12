package Extends.ExtendsTest2;

public class Test1 {

    public static void main(String []args) {
        Zi z = new Zi();
        z.ziShow();
    }

    static class Fu {
        String name = "Fu";
        String address = "南京";
    }

    static class Zi extends Fu {
        String name = "Zi";

        public void ziShow() {
            //要求输出结果为Zi, 下面的代码如何书写
            System.out.println(name);
            System.out.println(this.name); //Zi

            System.out.println("\n-------------\n");

            //要求输出结果为Fu, 下面的代码如何书写
            System.out.println(super.name); // Fu

            System.out.println("\n-------------\n");

            //要求输出结果为南京， 下面的代码如何书写
            System.out.println(address);
            System.out.println(this.address);
            System.out.println(super.address);
        }
    }
}

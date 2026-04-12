package Extends.ExtendsTest1;

public class Main {
    static void main() {

        Android a = new Android();
        a.brand = "魅族";
        a.price = 1999;
        System.out.println(a.brand + ", " + a.price);
        a.call();
        a.sendMessage();
        a.NFC();

        IOS i = new IOS();
        i.brand = "苹果";
        i.price = 5999;
        System.out.println(i.brand + ", " + i.price);
        i.call();
        i.sendMessage();

        Laptop l = new Laptop();
        l.brand = "联想";
        l.price = 10000;
        System.out.println(l.brand + ", " + l.price);
        l.coding();
    }
}

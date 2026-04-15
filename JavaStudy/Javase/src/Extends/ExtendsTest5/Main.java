package Extends.ExtendsTest5;

public class Main {
    static void main() {

        Phone p = new Phone();
        p.name = "小米";
        p.price = 4999;

        double payment = p.payment();
        System.out.println(payment);

        Laptop lt = new Laptop();
        lt.name = "联想";
        lt.price = 10000;
        double payment2 = lt.payment();
        System.out.println(payment2);
    }
}

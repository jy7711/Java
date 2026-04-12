package Enum;

public class EMain {
    static void main() {
        /*
        编写电商项目的六个状态
        待支付  PAYMENT_PENDING
        处理中  PROCESSING
        已发货  SHIPPED
        配送中  OUT_FOR_DELIVERY
        已送达  DELIVERED
        已取消  CANCELLED
        */

        //细节 ： 枚举类默认使用public static final修饰
        Enum o1 = Enum.PAYMENT_PENDING;
        System.out.println(o1);
        System.out.println(o1.getName());

        //匹配
        switch (o1) {
            case PAYMENT_PENDING -> System.out.println("待支付状态");
            case PROCESSING -> System.out.println("处理中");
            case SHIPPED -> System.out.println("已发货");
            case OUT_FOR_DELIVERY -> System.out.println("配送中");
            case DELIVERED -> System.out.println("已送达");
            case CANCELLED -> System.out.println("已取消");
        }

        //values
        Enum[] arr = Enum.values();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("\n----------------------");
        //valueOf
        Enum paymentPending = Enum.valueOf("PAYMENT_PENDING");
        System.out.println(paymentPending);//输出的结果是枚举项PAYMENT_PENDING， 不是里面的字符串
    }
}
/*
每一个枚举项， 都是该枚举类的对象， 每一个对象都是通过构造方法创建出来的

枚举项在底层其实就是常量， 默认用public static final修饰

枚举类的第一行上必须是枚举项， 枚举项之间用逗号隔开， 以分号作为结尾

枚举类的构造方法必须是private修饰， 不让外界创建本类的对象

编译器会给枚举类新增两个默认存在的方法： values(), valueOf()
 */

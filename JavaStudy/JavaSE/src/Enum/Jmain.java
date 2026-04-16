package Enum;

public class Jmain {
    static void main() {
        /*
        编写电商项目的六个状态
        待支付  PAYMENT_PENDING
        处理中  PROCESSING
        已发货  SHIPPED
        配送中  OUT_FOR_DELIVERY
        已送达  DELIVERED
        已取消  CANCELLED

        javabean --> 枚举
        */

        //这么写是正常的写法
        //但是对于确定状态数量的， 我们可以用枚举
        Javabean PAYMENT_PENDING = new Javabean("待支付");
    }
}

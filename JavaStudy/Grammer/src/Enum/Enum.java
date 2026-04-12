package Enum;

public enum Enum {
    //枚举好像只能写在一行， 且是第一行
    PAYMENT_PENDING("待支付"),
    PROCESSING("处理中"),
    SHIPPED("已发货"),
    OUT_FOR_DELIVERY("配送中"),
    DELIVERED("已送达"),
    CANCELLED("已取消");

    private String name;

    //因为这里是枚举已经构造过了， 所以这里不需要空参构造
    //public Enum() {}

    //同理， 枚举不让外界创建对象了， 这里应该改用private
    //枚举类默认是private
    private Enum(String name) {
        //枚举项直接构造
        System.out.println("判断枚举项是否执行——" + name);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

package Extends.ExtendsTest5;

public class Phone extends SmartDevice {

    /*
    方法重写要注意 ：
        1. 如果父类里面的代码， 我一行都不想用， 此时把子类中的方法重新完整写一遍即可
        2. 如果父类里面的代码我还想用， 此时我只是在父类的基础上再加上其他的逻辑
           此时可以通过super关键字调用父类的方法得到一个结果， 再对这个结果进行操作即可
     */
    @Override
    public double payment() {
        //调用父类里面的oayment方法先计算出商品的价格
        double payment = super.payment();
        payment = payment * 0.9;
        return payment;
    }
}
/*
方法重写的注意事项和要求
    1.  重写方法的名称， 形参列表必须与父类中的一致， 方法体按照实际需求书写
    2.  了解 ： 子类重写父类方法时， 访问权限子类必须大于父类 （private < 空着不写 < protected < public ）
    3.  了解 ： 子类重写父类方法时， 返回值类型子类必须小于等于父类
    4.  建议 ： 重写方法的申明和父类保持一致即可
    5.  final修饰类为最终类， 里面所有的方法不能被重写
    6.  private私有方法， static静态方法， final最终方法不能被重写
 */

package ArrayTool;

import java.util.*;
public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        //初始化数组
        System.out.println("请输入数组大小： ");
        int n = sc.nextInt();
        //定义数组
        int []a = new int [n];
        System.out.print("请初始化数组：");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            //System.out.println("a[" + i + "] = " + a[i]);
        }
        //打印数组
        ArrTool.Print(a);
        ArrTool.Average(a);
        ArrTool.Sort(a);
        ArrTool.Print(a);
    }
}

/*
静态方法只能访问静态变量和静态方法

非静态方法可以访问静态变量或者静态方法， 也可以访问非静态的成员变量和非静态的成员方法

静态方法中没有this关键字

总结 ： 静态只能调用静态， 非静态可以调用所有

why : 为什么一定要有静态方法不能全用非静态

My answer :
每个非静态方法的调用都需要新建一个对象，
在项目中这样会导致代码臃肿以及不必要的内存消耗，
而用静态方法直接调用类加方法名能有效避免这种情况

AI answer :
静态方法：直接通过类名调用，无需创建对象，省去了实例化步骤，代码简洁且节省内存（特别是对于无状态的方法，如工具类）。
非静态方法：必须依托具体对象，适合操作对象的特有属性，保证数据独立性。

在实际项目中，合理混用两者：

工具类、工厂方法、程序入口等 → 静态

操作对象属性、行为依赖对象状态 → 非静态

这样既保证了灵活性，又避免了不必要的内存开销。
 */
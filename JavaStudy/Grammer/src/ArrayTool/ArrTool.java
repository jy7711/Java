package ArrayTool;

import java.util.Arrays;

public class ArrTool {
    //static void Print() {}
    //工具类的调用应该公开
    static void Print(int []a) {
        System.out.println("打印该数组 ： ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void Average(int []a) {
        double sum = 0.0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        System.out.println("该数组的平均数为 ： " + sum/a.length);
    }

    public static void Sort(int []a) {
        Arrays.sort(a);
    }

}

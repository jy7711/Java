package Function.FunctionTest6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class Main {
    /*
            方法引用 ： 数组的构造方法
            格式 ：
                    数据类型::new
            需求 ：
                    集合中存储了一些整数放到数组中
            细节 ：
                    数组的类型要和集合的类型保持一致
     */
    static void main() {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5);

        Integer[] arr = list.stream().toArray(new IntFunction<Integer[]>() {
            @Override
            public Integer[] apply(int value) {
                return new Integer[value];
            }
        });
        System.out.println(Arrays.toString(arr));
        System.out.println("------------------------------");

        Integer[] arr2 = list.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(arr2));
    }
}
/*
1. 引用静态方法
        类名::静态方法

2. 引用成员方法
        对象::成员方法
        this::成员方法
        super::成员方法

3. 引用构造方法
        类名::new

4. 使用类名引用成员方法
        类名::成员方法

5. 引用数组的构造方法
    数据类型[]::new

*/

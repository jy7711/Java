package Function.FunctionTest1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

public class Main {
    /*
        倒序排序
     */
    static void main() {
        Integer []arr = {3, 5, 1, 2, 4, 6};

        //匿名内部类
//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1;
//            }
//        });

        //lambda表达式
        //因为第二个参数类型Comparator是函数式接口
        //Arrays.sort(arr, (o1, o2) -> o2-o1);

        //方法引用

        // 1. 引用处需要是函数式接口
        // 2. 被引用的方法需要已经存在
        // 3. 被引用方法的形参和需要返回值需要跟抽象方法的形参和返回值保持一致
        // 4. 被引用方法的功能需要满足当前的要求

        //表示引用Main类里面的substration方法
        //把这个方法当作抽象方法的方法体
        Arrays.sort(arr, Main::substration);
        System.out.println(Arrays.toString(arr));

    }

    //可以是java写好的， 也可能是第三方工具类
    public static int substration(Integer num1, Integer num2) {
        return num2 - num1;
    }
}

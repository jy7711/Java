package Sstream.StreamTest4;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    static void main() {
        int[] a1 =  {1, 2, 3, 4, 5, 6, 7, 8, 9};

        String[] a2 = {"a", "b", "c"};

        Arrays.stream(a1).forEach(s -> System.out.println(s));

        Arrays.stream(a2).forEach(s -> System.out.println(s));


        /*
        注意 ：
        Stream接口中静态方法of的细节
        方法的形参是一个可变参数， 可以传递一堆零散的数据， 也可以传递数组
        但是数组必须是引用数据类型的， 如果是基本数据类型， 是会把整个数组当作一个元素放到Stream中
         */
        Stream.of(a1).forEach(s -> System.out.println(s));//[I@6b884d57
    }
}

package Function.FunctionTest2;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    /*
            方法引用 ： 引用静态方法
     */
    static void main() {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "4", "5");

        list.stream().map(Integer::parseInt).forEach(System.out::println);
    }
}

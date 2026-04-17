package Sstream.StreamTest11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    /*
            定义一个集合， 1-10， 过滤奇数， 剩下的存起来
     */
    static void main() {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll( list,1,2,3,4,5,6,7,8,9,10);

        List<Integer> newlist = list.stream()
                .filter(n -> n%2 == 0)
                .collect(Collectors.toList());

        System.out.println(newlist);
    }
}

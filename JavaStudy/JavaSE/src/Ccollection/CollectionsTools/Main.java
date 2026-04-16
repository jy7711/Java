package Ccollection.CollectionsTools;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    static void main() {

        ArrayList<String> list = new ArrayList<>();

        //批量添加元素
        Collections.addAll( list,"AAA", "bbb", "CCC");

        //shuffle打乱
        Collections.shuffle(list);

        //sort(list)  排序
        //sort(list, Comparator<> c) 按指定规则排序
        //copy 拷贝
        //fill 用指定元素填充
        //max, min 根据默认的自然排序获取最大， 最小值
        //swap 交换指定位置元素
    }
}

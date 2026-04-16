package Ccollection.Iimmutable.MapTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Main2 {
    static void main() {

        HashMap<String, String> hm = new HashMap<>();

        hm.put("张三", "南京");
        hm.put("李四", "北京");
        hm.put("王五", "上海");

        //获取所有的键值对对象
        Set<Map.Entry<String, String>> entries = hm.entrySet();
        //把entries变成一个数组
        Map.Entry[] arr1 = new Map.Entry[0];
        // toArray方法在底层会比较集合的长度和数组的长度两者的大小
        // 如果集合的长度 > 数组的长度 ： 数据在数组中放不下， 此时会根据实际数据的个数， 重新创建数组
        // 如果集合的长度 <= 数组的长度 ： 数据在数组中放得下， 此时不会创建新的数组， 而是直接用
        Map.Entry[] arr2 = entries.toArray(arr1);
        Map map = Map.ofEntries(arr2);
        //System.out.println(map);
        //map.put("bbb", "222");


        Map<Object, Object> map1 = Map.ofEntries(hm.entrySet().toArray(new Map.Entry[0]));
        //System.out.println(map1);

        Map<String, String> map2 = Map.copyOf(hm);
        //System.out.println(map2);
    }
}

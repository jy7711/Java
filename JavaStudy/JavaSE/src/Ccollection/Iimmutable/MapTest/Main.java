package Ccollection.Iimmutable.MapTest;

import java.util.Map;
import java.util.Set;

public class Main {
    /*
        创建Map的不可变集合

        细节1 ：
            键是不能重复的
        细节2 ：
            Map里面的of方法， 参数是有上限的， 最多只能传递20个参数， 10个键值对
        细节3 ：
            如果我们要传递多个键值对对象， 数量大于10个， 在Map接口中还有一个方法
     */
    static void main() {
        Map<String, String> map = Map.of("张三", "南京", "李四", "北京", "王五", "上海");

        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + "+" + map.get(key));
        }
        System.out.println("----------------------");

        Set<Map.Entry<String,String>> entries = map.entrySet();
        for (Map.Entry<String,String> entry : entries) {
            System.out.println(entry.getKey() + "+" + entry.getValue());
        }
        System.out.println("----------------------");
    }
}

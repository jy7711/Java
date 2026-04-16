package Ccollection.Map.LinkedHashMap;

import java.util.LinkedHashMap;

public class Main {

    static void main() {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("c", 123);
        lhm.put("b", 345);
        lhm.put("a", 111);
        lhm.put("a", 777);

        System.out.println(lhm);
    }
}

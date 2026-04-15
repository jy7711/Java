package Ccollection.Map.TreeMap.TreeMapTest3;

import java.util.TreeMap;

public class Main {

    static void main() {
        String s = "aababcabcdabcde";

        TreeMap<Character, Integer> tm = new TreeMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (tm.containsKey(c)) {
                tm.put(c, tm.get(c)+1);
            }
            else tm.put(c, 1);
        }

        System.out.println(tm);
    }
}

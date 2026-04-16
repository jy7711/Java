package Sstream.StreamTest5;

import java.util.stream.Stream;

public class Main {

    static void main() {


        Stream.of(1,2,3,4,5).forEach(s -> System.out.println(s));

        Stream.of("a", "b", "c", "d", "e").forEach(s -> System.out.println(s));

    }
}

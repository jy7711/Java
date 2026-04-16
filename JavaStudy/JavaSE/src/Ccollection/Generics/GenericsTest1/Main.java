package Ccollection.Generics.GenericsTest1;

public class Main {

    static void main() {

        MyArrayList<String> a1 = new MyArrayList<>();
        a1.add("aaa");
        a1.add("bbb");
        a1.add("ccc");
        System.out.println(a1);

        MyArrayList<Integer> a2 = new MyArrayList<>();
        a2.add(123);
        a2.add(456);
        a2.add(789);
        System.out.println(a2);

        System.out.println(a2.get(0));
    }
}

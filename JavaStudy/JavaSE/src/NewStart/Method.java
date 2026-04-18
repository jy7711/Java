package NewStart;

public class Method {

    static void main() {
        int a = 20, b = 30, c = 40;
        System.out.println(getsum(a, b));
        System.out.println(getsum(a));
        System.out.println(getsum(a, b, c));
    }

    //方法的重载， 很神奇的一个东西
    public static void getsum() {}

    public static int getsum(int a) {
        return a;
    }

    public static int getsum(int a, int b) {
        return a+b;
    }

    public static int getsum(int a, int b, int c) {
        return a+b+c;
    }
}
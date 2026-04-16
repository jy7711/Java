package Ccollection.Args;

public class Main {

    /*
    可变参数
            方法形参的个数是可以发生变化的0， 1， 2， 3
            格式 ： 属性...名字
            int...args
            **方法形参最多写一个可变参数
            **在方法当中， 如果除了可变参数以外， 还有其他的形参， 那么可变参数要写在最后
     */
    static void main() {
        int []a = {1,2,3,4,5,6,7,8,9,10};
        int sum = getsum1(a);
        System.out.println(sum);
        int cal = getsum2(1,2,3,4,5);
        System.out.println(cal);
    }

    public static int getsum1(int[] a) {
        int sum = 0;
        for (int x : a) sum += x;
        return sum;
    }

    public static int getsum2(int...x) {
        int sum = 0;
        for (int c : x) sum += c;
        return sum;
    }
}

package NewStart;

import java.util.*;

public class Array {
    static void main() {

        Scanner sc = new Scanner(System.in);
        //动态定义一个数组
        int n = sc.nextInt();
        int[] a = new int [n];


        for (int i = 0; i < 5; i++) a[i] = sc.nextInt();

        for (int i = 0; i < 5; i++) System.out.print(a[i] + " ");
        System.out.println();

    }
}

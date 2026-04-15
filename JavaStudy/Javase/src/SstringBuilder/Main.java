package SstringBuilder;

public class Main {

    static void main() {
        /*

            StringBuilder的构造方法
            public StringBuilder()   空参构造
            public StringBuilder(String str) 带参构造

            常见成员方法
                append(任意类型) 添加数量
                reverse()      反转
                int length()   获取长度
                toString       变回字符串
         */

        //shift + f6 批量修改
        StringBuilder sb1 = new StringBuilder();
        System.out.println(sb1.length());

        StringBuilder sb2 = new StringBuilder("abc");
        System.out.println(sb2);
        sb2.reverse();
        sb2.append("aaa");
        sb2.append("bbb");
        sb2.append("ccc");
        System.out.println(sb2);
    }
}
/*
StringBuilder和String的区别
StringBuilder是可变的， String是不可变的
在多次的增删改字符串时， String每次是创建一个添加后的新字符串， 而StringBuilder是在原字符串基础上直接在后面添加， 在内存和运行速度上的性能大幅度提高

特性	        String	                        StringBuilder
线程安全	    安全（不可变）	                    不安全（多线程需外部同步或改用 StringBuffer）
适用场景	    少量拼接、常量、作为 HashMap key	循环拼接、大量修改、动态生成 SQL/JSON
内存效率	    低（频繁创建新对象）	            高（复用内部数组）
 */
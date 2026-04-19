package Exception.ExceptionTest4;

public class Main {
    /*
            public String getMessage()      返回此 throwable 的详细信息字符串
            public String toString()        返回此可抛出的简短描述
            public void printStackTrace()   把异常的错误信息输出在控制台
                                            底层是利用System.err.println进行输出
                                            把异常的错误信息以红色字体输出在控制台
                                            细节 ： 仅仅是打印信息， 不会停止程序运行
     */
    static void main() {
        int [] arr = {1, 2, 3, 4, 5, 6};

        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            //System.out.println(e.getMessage());//Index 10 out of bounds for length 6
            //System.out.println("-----------------------------");

            //System.out.println(e.toString());//java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 6

            e.printStackTrace();
            //java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 6
            //	at Exception.ExceptionTest4.Main.main(Main.java:14)
        }

//        System.err.println(111);//红色的111
//        System.out.println(111);
        System.out.println("kk");
    }
}

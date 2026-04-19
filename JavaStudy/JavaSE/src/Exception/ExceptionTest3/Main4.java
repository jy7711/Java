package Exception.ExceptionTest3;

public class Main4 {
    /*
             自己处理（捕获异常）  灵魂四问
             灵魂四问 ： 如果try中遇到了问题， 那么try下面的其他代码还会执行吗
                            下面的代码就不会执行了， 直接跳转到对应的catch中， 执行catch里面的语句体
                            但是如果没有对应的catch与之匹配， 那么还是会交给虚拟机进行处理
     */
    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        try {
            System.out.println(arr[10]);
            System.out.println("111");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界了");
        }
        //**在第一次被抓住（catch）之后， 直接执行catch里面的内容， 不会管后面的try和catch了， 执行完跳出
        System.out.println("kk");
    }
}

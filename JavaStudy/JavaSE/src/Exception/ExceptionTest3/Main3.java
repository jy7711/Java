package Exception.ExceptionTest3;

public class Main3 {
    /*
             自己处理（捕获异常）  灵魂四问
             灵魂三问 ： 如果try里面遇到的问题没有被捕获， 怎么执行？
                         相当于try...catch里面的代码白写了， 最终还是会交给虚拟机进行处理
     */
    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        try {
            System.out.println(arr[10]);
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        }
        //**在第一次被抓住（catch）之后， 直接执行catch里面的内容， 不会管后面的try和catch了， 执行完跳出
        System.out.println("kk");
    }
}

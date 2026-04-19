package Exception.ExceptionTest3;

public class Main1 {
    /*
            自己处理（捕获异常）  灵魂四问
            灵魂一问 ： 如果try里面没有遇到问题， 怎么执行？
                        会把try里面的代码执行完毕， 不会执行catch里面的代码
                        注意 ：只有当出现异常了才会执行catch里面的代码
    */
    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        try {
            System.out.println(arr[0]);
        } catch (ArrayIndexOutOfBoundsException e) {
            //如果出现了ArrayIndexOutOfBoundsException异常， 我该如何处理
            System.out.println("索引越界了");
        }

        System.out.println("kk");
    }
}

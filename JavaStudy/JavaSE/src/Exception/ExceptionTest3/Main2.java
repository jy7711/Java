package Exception.ExceptionTest3;

public class Main2 {
    /*
             自己处理（捕获异常）  灵魂四问
             灵魂二问 ： 如果try里面遇到多个问题， 怎么执行？
                         会写多个catch与之对应
                         细节 ：
                                如果我们要捕获多个异常， 这些异常如果存在父子关系的话， 那么父类一定要写在下面
                        了解性 ：
                                JDK7之后， 我们可以在catch中同时捕获多个异常， 中间用    |   进行隔开
                                表示如果出现了A异常或者B异常的话， 采取同一种处理方案
     */
    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6};
        try {
            //System.out.println(arr[10]);
            //System.out.println(2/0);
            String s = null;
            System.out.println(s.equals("abc"));
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("索引越界了或除以0");
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        } catch (Exception e) {
            System.out.println("Exception");
        }
        //**在第一次被抓住（catch）之后， 直接执行catch里面的内容， 不会管后面的try和catch了， 执行完跳出
        System.out.println("kk");
    }
}

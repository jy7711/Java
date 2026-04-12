package oopStudent;
import java.util.*;
public class Main {
    static void main() {

        Scanner sc = new Scanner(System.in);
        // jy j;
        Student s = new Student();

        //如果在非String的变量后面用了String, 我们需要用一个nextLine用来吞掉回车， 不然String就是回车
        //很神奇， 这里在数字后面改用了空格， 输出就是空格加名字， 果然是读取一行呢
        //sc.nextLine();
        //好耶用next就既不吞回车也不吃空格， 只是单独的一段String, 而且还不用再nextLine重新吃掉一遍回车
        System.out.print("请输入姓名：");
        String name = sc.next();
        System.out.print("请输入年龄：");
        int age = sc.nextInt();
        System.out.print("请输入身高：");
        int height = sc.nextInt();
        System.out.print("请输入体重：");
        int weight = sc.nextInt();
        System.out.print("请输入疲劳值：");
        int tired = sc.nextInt();
        s.setName(name);
        s.setAge(age);
        s.setHeight(height);
        s.setWeight(weight);
        s.setTired(tired);
        s.informationOutput();

        boolean True = true;
        while (True) {
            System.out.println("请选择当前进程： ");
            System.out.println("1. 进行活动");
            System.out.println("2. 查看当前疲劳值");
            System.out.println("3. 退出进程");
            System.out.print("进行选择 ： ");
            int op = sc.nextInt();
            if (op == 1) {
                Activity.activity(s);
            }
            else if (op == 2) {
                System.out.println("当前疲劳值为" + s.getTired());
            }
            else if (op == 3) {
                True = false;
                System.out.println("See you later!");
            }
            else {
                System.out.println("无效选项!");
            }
            System.out.println();
        }
    }
}

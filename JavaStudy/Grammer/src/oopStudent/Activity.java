package oopStudent;
import java.util.*;

public class Activity {
    static void activity(Student s) {
        Scanner sc = new Scanner(System.in);
        boolean True = true;
        while (True) {
            System.out.println("请选择当前活动： ");
            System.out.println("1. 玩");
            System.out.println("2. 学习");
            System.out.println("3. 睡觉");
            System.out.println("4. 退出");
            System.out.print("进行选择 ： ");
            int op = sc.nextInt();
            if (op == 1) {
                s.Play();
            }
            else if (op == 2) {
                s.Study();
            }
            else if (op == 3) {
                s.Sleep();
            }
            else if (op == 4) {
                True = false;
            }
            else {
                System.out.println("无效选项!");
            }
            System.out.println();
        }
    }
}

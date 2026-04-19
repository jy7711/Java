package Exception.ExceptionTest6;

import java.util.Scanner;

public class Main {
    /*
           需求 ：
                键盘录入自己心仪的女朋友姓名和年龄
                姓名的长度在 3 - 10 之间
                年龄的范围在 18 - 40岁
                超出这个范围不能赋值， 需要重新录入， 一直录到正确的

           提示 ：
                录入年龄时超出范围， abc等情况
     */
    static void main() {
        Scanner sc = new Scanner(System.in);

        GirlFriend gf = new GirlFriend();

        while (true) {
            try {
                System.out.println("请输入姓名 ： ");
                String name = sc.nextLine();
                gf.setName(name);
                break;
            } catch (NameformatException e) {
                e.printStackTrace();
            }

        }

        while (true) {
            try {
                System.out.println("请输入年龄 ： ");
                String ageStr = sc.nextLine();
                gf.setAge(Integer.parseInt(ageStr));
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (AgeoutofboundException e) {
                e.printStackTrace();
            }
        }

        System.out.println(gf);
    }
}

package Extends.ExtendsTest4;

public class ThirdGenerationPhone extends SecondGenerationPhone{
    //注释/注解 ： 都是对代码的解释说明
    //注释 ： 给程序员看的， 文字性的内容
    //注解 ： 给虚拟机看的

    @Override
    //注意此时调用参数必须与原方法一致？
    public void call() {
        System.out.println("打开视频");
        System.out.println("利用手机打电话");
    }

    public void playGame() {
        System.out.println("利用手机玩游戏");
    }
}

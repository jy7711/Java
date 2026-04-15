package Interface.InterfaceTest2;

public class BasketBallCoach extends Coach{

    public BasketBallCoach() {
    }

    public BasketBallCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练正在教打篮球");
    }
}

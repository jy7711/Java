package Circle;

public class Main {

    static void main() {

        //创建圆的对象
        Circle c = new Circle(1.5);

        //获取圆的属性

        //边长
        System.out.println(c.getRadii());
        //圆周率
        System.out.println(c.getPI());
        //面积
        System.out.println(c.getArea());
        //周长
        System.out.println(c.getLength());
    }
}

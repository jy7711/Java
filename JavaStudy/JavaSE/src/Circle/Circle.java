package Circle;

public class Circle {

    private double radii;
    private final double PI = 3.14;

    public Circle() {}

    public Circle(double radii) {
        this.radii = radii;
    }

    //获取圆的半径
    public double getRadii() {
        return radii;
    }

    public void setRadii(double radii) {
        this.radii = radii;
    }

    public double getPI() {
        return PI;
    }

    //获取面积
    public double getArea() {
        return PI * radii * radii;
    }

    //获取周长
    public double getLength() {
        return PI * radii * 2;
    }
}

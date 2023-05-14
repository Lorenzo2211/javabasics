package javaoopadvanced.oopadvanced._2;

public class Rectangle extends Shape {
    public Rectangle(double height, double weight) {
        super(height, weight);
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow((getHeight() / 2), 2);
    }
}

package javaoopadvanced.oopadvanced._2;

public class Circle extends Shape{
    public Circle(double height, double weight) {
        super(height, weight);
        if (height != weight){
            System.err.println("The height and diameter of the circle are different");
        }
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow((getHeight() / 2), 2);
    }
}

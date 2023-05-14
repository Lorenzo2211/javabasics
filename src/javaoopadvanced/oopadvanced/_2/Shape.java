package javaoopadvanced.oopadvanced._2;

public abstract class Shape {

    private double height, weight;

    public Shape(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    abstract double calculateArea();
}

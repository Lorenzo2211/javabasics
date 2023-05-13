package javaoopadvanced.oopadvanced._1;

public class Bird extends Animal{
    double wingSpan;
    public Bird(double height, double weight, double wingSpan) {
        super(height, weight);
        this.wingSpan = wingSpan;
    }
    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }
    public double flySpeedMetersPerSecond(){
        return this.getWingSpan() * 4;
    }
}

package javaoopadvanced.oopadvanced._1;

public class Dog extends Animal {
    private String breed;
    public Dog(double height, double weight, String breed) {
        super(height, weight);
    }
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double runSpeedMetersPerSecond(){
        return this.getHeight() * 2;
    }
}

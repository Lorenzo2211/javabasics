package javaoopadvanced.oopadvanced._1;

public class Fish extends Animal{
    String species;
    public Fish(double height, double weight, String species) {
        super(height, weight);
        this.species = species;
    }
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double swimSpeedMetersPerSecond(){
        return this.getWeight() * 2;
    }
}


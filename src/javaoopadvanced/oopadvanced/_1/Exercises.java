package javaoopadvanced.oopadvanced._1;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     *
     *
     * Create a class called "Dog" that extends the Animal class.
     *
     * Add a new field called "breed" to the Dog class.
     *
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     *
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Dog dog = new Dog(0.64, 50.0,"Corso");
    }

    /**
     * 2:
     *
     *
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     *
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     *
     * Also create constructors, getters and setters
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Fish fish = new Fish(0.45, 5.0,"Carpa" );
        Bird bird = new Bird(0.88, 5.0, 1.80);
    }


    /**
     * 3:
     *
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     *
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Dog caneCorso = new Dog(0.64, 50.0,"Corso");
        Fish carpa = new Fish(0.45, 3.0,"Carpa" );
        Bird aquila = new Bird(0.88, 5.0, 1.80);
        if (caneCorso.runSpeedMetersPerSecond() > carpa.swimSpeedMetersPerSecond()) {
            if (caneCorso.runSpeedMetersPerSecond() > aquila.flySpeedMetersPerSecond()) {
                System.out.println("The dog is faster!");
            }
        } else if (carpa.swimSpeedMetersPerSecond() > caneCorso.runSpeedMetersPerSecond()) {
            if (carpa.swimSpeedMetersPerSecond() > aquila.flySpeedMetersPerSecond()) {
                System.out.println("The fish is faster!");
            }
        } else if (aquila.flySpeedMetersPerSecond() > caneCorso.runSpeedMetersPerSecond()){
            if (aquila.flySpeedMetersPerSecond() > carpa.swimSpeedMetersPerSecond()){
                System.out.println("The eagle is faster!");
            }
        }
    }
}

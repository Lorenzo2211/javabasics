package javaoopadvanced.oopadvanced._4;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     * <p>
     * <p>
     * In the main method, create a variable x as a random number between 0-100 using Math.random() * 100;
     * <p>
     * Use a ternary operator to check if x is greater than or equal to 50. If it is, print "x is greater than or equal to 50". If it's not, print "x is less than 50".
     * <p>
     * Experiment with different values of x and observe the output
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        double x = Math.random() * 100;
        String xScore = x > 50 ? "x is greater than or equal to 50" : "x is less than 50";
        System.out.println(x);
        System.out.println(xScore);

    }

    /**
     * 2:
     * <p>
     * <p>
     * <p>
     * Create a record called "Person" with fields for name, age and address.
     * <p>
     * Add a toString method to Person to print out the data in a different format
     * <p>
     * Print the record to the console
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Person person = new Person("Mario", 40, "Via Verdi 12");
        System.out.println(person.toString());
    }

    /**
     * 3:
     * <p>
     * <p>
     * In the main method, create a BigInteger variable with a large value.
     * <p>
     * Create a BigDecimal variable with a large value
     * <p>
     * Divide the BigInteger by 3 using the divide method and assign the result to a new BigInteger variable
     * <p>
     * Divide the BigDecimal by Math.PI using the divide method and assign the result to a new BigDecimal variable
     * <p>
     * Print the results
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here

        BigInteger bigInteger;
        bigInteger = new BigInteger("3204231746320466588909");
        String bigIntegerString = bigInteger.toString();

        BigDecimal bigDecimal;
        bigDecimal = new BigDecimal("0.84762136418763264657");
        String bigDecimalString = bigDecimal.toString();

        String bigIntegerDividedString = bigInteger.divide(new BigInteger("3")).toString();
        System.out.println(bigIntegerDividedString);

        String bigDecimalDividedString = bigDecimal.divide(new BigDecimal(Math.PI), RoundingMode.HALF_UP).toString();
        System.out.println(bigDecimalDividedString);
    }
}

package javabasics._4;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Store your age in an appropriate variable, print it out in
     *    one line using the "+" in your print statement. Only use 1 print statement
     */
    private static void exercise1() {
        System.out.println("\nExercise 1:");
        // Wrote code here
        int age = 21;
        System.out.println("My age is " + age );

    }

    /**
     * 2: Store your first name initial (i.e. Jane -> J) in a variable, your age in another variable.
     *    And then print them out on the same line using the following idea
     *    System.out.println("My Age=" + myAge +", my initial=" + myInitial);
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        //Wrote code here
        char initialOfName = 'L';
        int age = 21;
        System.out.println( age + " is my age"+" and the initial of my name is " + initialOfName);
    }

    /**
     * 3: Write comments above each line of code, describing what the line of code is doing
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        // storing if he has eaten
        boolean hasEatenLunch = false;
        // storing the cost of lunch
        double lunchCost = 5.99;
        // printing out the cost of lunch
        System.out.println("Lunch cost=" + lunchCost);
        // printing if he has eaten
        System.out.println("Has Eaten lunch=" + hasEatenLunch);
    }
}

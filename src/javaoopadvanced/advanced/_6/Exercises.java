package javaoopadvanced.advanced._6;

import jdk.jfr.FlightRecorder;

import javax.swing.*;
import java.awt.image.DataBufferUShort;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }

    /**
     * 1:
     *
     *
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     *
     * Loop over the values with Days.values() and print them out.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        for (Days day : Days.values()){
            System.out.println(day);
        }
    }
    public enum Days {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    /**
     * 2:
     *
     *
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     *
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        value(Seasons.WINTER);

    }
        // Your code here
        public enum Seasons {
            SPRING("March, April and May"),
            SUMMER("June, July and August"),
            FALL("September, October and November"),
            WINTER("December, January and February");

            String seasonMonth;


            Seasons(String seasonMonth) {
                this.seasonMonth = seasonMonth;
            }

            public String getSeasonMonth() {
                return seasonMonth;
            }
        }
        public static String value (Seasons value){
            return value.getSeasonMonth();
        }

    /**
     * 3:
     *
     *
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     *
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     *
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        TrafficLight start = TrafficLight.GREEN;
        start = start.light(start);
        System.out.println(start);
    }
    public enum TrafficLight {
        RED,
        YELLOW,
        GREEN;

        public TrafficLight light(TrafficLight light) {
            if (light == TrafficLight.RED) {
                try {
                    System.out.println("E' rosso, STOP!");
                    Thread.sleep(2000);
                    System.out.println("Il verde sta arrivando");
                    Thread.sleep(2000);
                    return TrafficLight.GREEN;
                } catch (Exception exception) {
                    System.err.println("Semaforo non funzionante");
                    exception.printStackTrace();
                    throw new RuntimeException(exception);
                }
            } else if (light == TrafficLight.YELLOW) {
                try {
                    System.out.println("E' giallo, ATTENZIONE!");
                    Thread.sleep(2000);
                    System.out.println("Il rosso sta arrivando");
                    Thread.sleep(2000);
                    return TrafficLight.RED;
                } catch (Exception exception) {
                    System.err.println("Semaforo non funzionante");
                    exception.printStackTrace();
                    throw new RuntimeException(exception);
                }
            } else if (light == TrafficLight.GREEN) {
                try {
                    System.out.println("E' verde, puoi passare!");
                    Thread.sleep(2000);
                    System.out.println("Il giallo sta arrivando");
                    Thread.sleep(2000);
                    return TrafficLight.YELLOW;
                } catch (Exception exception) {
                    System.err.println("Semaforo non funzionante");
                    exception.printStackTrace();
                    throw new RuntimeException(exception);
                }
            }
            return light;
        }
    }

    /**
     * 4:
     *
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     *
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here
        Days isWeekend = Days.SATURDAY;

        System.out.println(isWeekend);

        if(isWeekend == Days.SATURDAY || isWeekend == Days.SUNDAY){
            System.out.println("Is weekend days");
        } else {
            System.out.println("Is weekdays");
        }
    }





    /**
     * 5:
     *
     *
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     *
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        // Your code here

        double num1 = 5;
        double num2 = 2;
        System.out.println(calculator(num1, num2, Operator.MULTIPLY));
    }

    public static double calculator(double num1, double num2, Operator operator) {
        if (operator == Operator.ADD) {
            return num1 + num2;
        } else if (operator == Operator.DIVIDE) {
            return num1 / num2;
        } else if (operator == Operator.SUBTRACT) {
            return num1 - num2;
        } else {
            return num1 * num2;
        }
    }
    public enum Operator {
        ADD,
        SUBTRACT,
        MULTIPLY,
        DIVIDE;
    }
}

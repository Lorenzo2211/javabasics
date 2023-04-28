package javaoop.exercises._3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *</p>
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *</p>
     *    Then create getters and setters for each of these 5 fields.
     *</p>
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        // Write and use your 5 getters and setters!
        Student student = new Student();
        String newName = "Mario";
        String newSurname = "Rossi";
        Integer newAge = 18;
        String newClassroom = "5D";
        String newSchool = "De Felice";

        student.setInformation(newName, newSurname, newAge, newClassroom, newSchool);
        System.out.println(student.getName() + " " + student.getSurname());
        System.out.println("She is " + student.getAge());
        System.out.println("She is in the class " + student.getClassroom() + ",in the school " + student.getSchool());
    }

    /**
     * 2: Create 3 setter constraints for the student class
     *</p>
     *    Think about what reasonably constraints are?
     *</p>
     *    Should a student be able to be a negative age?
     *</p>
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        //Write your code here
        List<String> studentNames = Arrays.asList("Alice", "Bob", "Charlie");
        List<String> studentSurnames = Arrays.asList("Biondi", "Joke", "Might");
        List<Integer> studentAges = Arrays.asList(16, -17, 18);
        List<String> studentClassroom = Arrays.asList("3C", "4D", "5FTH");
        List<String> studentSchool = Arrays.asList("De Angelis", "De Felice", "De Felice");


        Student student = new Student();
        for (int i = 0; i < studentAges.size(); i++){
            String newName = studentNames.get(i) ;
            String newSurname = studentSurnames.get(i);
            Integer newAge = studentAges.get(i);
            String newClassroom = studentClassroom.get(i);
            String newSchool = studentSchool.get(i);
            student.setInformation(newName, newSurname, newAge, newClassroom, newSchool);
            System.out.println(student.getName() + " " + student.getSurname());
            System.out.println("She is " + student.getAge());
            System.out.println("She is in the class " + student.getClassroom() + ",in the school " + student.getSchool());
        }
    }
}

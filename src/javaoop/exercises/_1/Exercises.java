package javaoop.exercises._1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercises {
    public static void main(String[] args) {
        exercise2();
        exercise3();
    }

    /**
     * 1: Create a new Class in this package
     * <p>
     * Call this class 'Course'
     * <p>
     * Inside add the following variables, using an appropriate type.
     * courseName, maxStudents, qualityRatingOutOf10
     * <p>
     * On top of this choose 2 variables of your choice!
     */
    static void course() {
        Course javaBasics = new Course();
        javaBasics.courseName = "JavaBasics Course";
        javaBasics.maxStudents = 80;
    }

    /**
     * 2: use the class called 'Student', add variables
     * (class variables are called 'fields' or 'attributes')
     * called 'name' and 'age'
     * <p>
     * Using the function below set the student name and ages
     */
    private static List<Student> exercise2() {
        System.out.println("Exercise 2:");
        List<String> studentNames = Arrays.asList("Alice", "Aragon", "Alex");
        List<Integer> studentAges = Arrays.asList(23, 31, 38);
        List<Student> students = new ArrayList<Student>();
        // Use a for i loop
        for (int i = 0; i < 3; i++) {
            Student student = createNewStudent(studentNames.get(i), studentAges.get(i));
            System.out.println(student.name + " " + student.age);
            students.add(student);
        }
        return students;
    }

    private static Student createNewStudent(String name, Integer age) {
        Student student = new Student();
        // Write your code here
        student.age = age;
        student.name = name;
        return student;
    }

    /**
     * 3: Finally lets edit our 'Course' class once more,
     *
     *    This time we are going to add another internal variable (field or attribute) called
     *    students. It's going to be a List<Student> called students
     *
     *    Copy the code above and add the students from exercise 2
     *
     *    Bonus: Using an appropriate loop of your choice find the average age of our students.
     *
     *    Hint: use a double to stop automatic integer rounding
     */

    private static void exercise3() {
        System.out.println("\nExercise 3:");

        // Write your code here
        Course course = new Course();
        course.student = exercise2();
        float averageAge = 0;
        for (Student student : course.student) {
            averageAge += student.age;
        }
        System.out.println(averageAge /= course.student.toArray().length);
    }
}
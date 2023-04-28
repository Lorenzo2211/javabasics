package javaoop.exercises._3;

public class Student {
    private String name = null;
    private String surname = null;
    private Integer age = null;
    private String classroom = null;
    private String school = null;

    String getName(){
        return this.name;
    }
    String getSurname(){
        return this.surname;
    }
    Integer getAge(){
        if (this.age < 0){
            System.out.println("Invalid Age");
        }
        return this.age;
    }
    String getClassroom(){
        if (this.classroom.length() > 3){
            System.out.println("Invalid Classroom");
        }
        return this.classroom;
    }
    String getSchool(){
        if (this.school != "De Felice"){
            System.out.println("Invalid School");
        }
        return this.school;
    }

    void setInformation(String newName, String newSurname, Integer newAge, String newClassroom, String newSchool){
        this.name = newName;
        this.surname = newSurname;
        this.age = newAge;
        this.classroom = newClassroom;
        this.school = newSchool;
    }
}


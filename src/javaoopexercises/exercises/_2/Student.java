package javaoop.exercises._2;

public class Student {
    String name = null;
    Integer age = null;
    Student (String name, Integer age) {
        System.out.println("Constructing!");
        this.name = name;
        this.age = age;
    }

    Student (String name){
        this.name =name;
    }
    Student (Integer age){
        this.age = age;
    }
    Student (){

    }
    public void printName (){
        System.out.println("Name = " + name + "," +
                            " Age = " + age);
        System.out.println("Constructed!");
    }

}

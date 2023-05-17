package javaoopadvanced.oopadvanced._3;

public class Person extends Object{
    String name;
    int age;
    String address;
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "Name: " + name +
                ", Age: " + age +
                ", Address: " + address +
                "}";
    }

    @Override
    public int hashCode(){
        return name.hashCode() + age + address.hashCode();
    }


}

package javaoopadvanced.oopadvanced._4;

public record Person(String name, int age, String address) {

    @Override
    public String toString() {
        return "La persona si chiama " + name +
                ", ha " + age + " anni" +
                " e vive in " + address;
    }
}

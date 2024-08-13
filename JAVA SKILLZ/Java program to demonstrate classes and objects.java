// Java program to demonstrate classes and objects
class Person {
    String name;
    int age;

    void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }
}

public class PersonExample {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Alice";
        person.age = 30;
        person.introduce();
    }
}

import java.security.Permission;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person person = new Person("zhangsan", 15);
        System.out.println(person.name + ": " + person.age);
    }
}

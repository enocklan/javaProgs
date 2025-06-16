//encapsulation example in Java

public class Person {
    // Private fields (data hiding)
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age >= 0) { // Simple validation
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Alice");
        p.setAge(30);

        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}
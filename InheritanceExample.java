// Parent class (superclass)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class (subclass) inherits from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat(); // Inherited method from Animal
        myDog.bark(); // Method from Dog
    }
}
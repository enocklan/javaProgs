public class MethodParametersExample {
    // Method with parameters
    public static void greetUser(String name, int age) {
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
    }

    public static void main(String[] args) {
        // Calling the method with arguments
        greetUser("Alice", 30);
        greetUser("Bob", 25);
    }
}
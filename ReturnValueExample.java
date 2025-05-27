public class ReturnValueExample {
    // Method that returns the sum of two numbers
    public static int add(int a, int b) {
        return a + b; // returns the sum
    }

    public static void main(String[] args) {
        int result = add(5, 7); // calling the method and storing the return value
        System.out.println("The sum is: " + result);

        // You can also use the return value directly
        System.out.println("The sum of 10 and 20 is: " + add(10, 20));
    }
}
public class DoWhileExample {
    public static void main(String[] args) {
        // Real-life example: Asking for a password until it's correct
        String correctPassword = "java123";
        String enteredPassword;
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        do {
            System.out.print("Enter your password: ");
            enteredPassword = scanner.nextLine();
        } while (!enteredPassword.equals(correctPassword));

        System.out.println("Access granted!");
        scanner.close();
    }
}
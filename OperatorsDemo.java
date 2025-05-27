public class OperatorsDemo {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 3;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Assignment Operators
        int c = a;
        c += b;
        System.out.println("\nAssignment Operators:");
        System.out.println("c += b: " + c);
        c -= b;
        System.out.println("c -= b: " + c);

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Increment/Decrement Operators
        int d = 5;
        System.out.println("\nIncrement/Decrement Operators:");
        System.out.println("d++: " + (d++));
        System.out.println("After d++: " + d);
        System.out.println("++d: " + (++d));
        System.out.println("d--: " + (d--));
        System.out.println("After d--: " + d);
        System.out.println("--d: " + (--d));

        // Bitwise Operators
        int e = 5, f = 3;
        System.out.println("\nBitwise Operators:");
        System.out.println("e & f: " + (e & f));
        System.out.println("e | f: " + (e | f));
        System.out.println("e ^ f: " + (e ^ f));
        System.out.println("~e: " + (~e));
        System.out.println("e << 1: " + (e << 1));
        System.out.println("e >> 1: " + (e >> 1));
    }
}

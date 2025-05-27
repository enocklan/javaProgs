public class WhileLoopExample {
    public static void main(String[] args) {
        // Real-life example: Counting money in a piggy bank
        int piggyBank = 0;
        int goal = 100; // Goal is to save 100 units
        int deposit = 10; // Deposit 10 units each time

        System.out.println("Saving money in a piggy bank:");
        while (piggyBank < goal) {
            piggyBank += deposit;
            System.out.println("Deposited " + deposit + ", total savings: " + piggyBank);
        }
        System.out.println("Goal reached! Total savings: " + piggyBank);
    }
}
package class_problems;

public class EvenSumCalculator {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            // Logical error was modulus check, solved by checking for 0 instead of 1
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("Sum of even numbers from 1 to 10 is " + sum);
    }
}

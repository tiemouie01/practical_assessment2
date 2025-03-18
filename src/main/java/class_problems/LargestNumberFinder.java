package class_problems;

public class LargestNumberFinder {
    public static void main(String[] args) {
        int[] numbers = new int[]{12, 45, 2, 67, 34, 89, 23};
        // Setting the max value to 0 will result in a logical error when all numbers
        // being compared are negative.
        // int max = 0;
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Largest number is " + max);
    }
}

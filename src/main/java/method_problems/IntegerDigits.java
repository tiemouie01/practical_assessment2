package method_problems;

public class IntegerDigits {
    public static void main(String[] args) {
        System.out.println("318 | number of digits: " + getNumberOfDigits(318));
        System.out.println("-92563 | number of digits: " + getNumberOfDigits(-92563));
        System.out.println("4666 | number of digits: " + getNumberOfDigits(4666));
        System.out.println("-314890 | number of digits: " + getNumberOfDigits(314890));
        System.out.println("654321 | number of digits: " + getNumberOfDigits(654321));
        System.out.println("638476 | number of digits: " + getNumberOfDigits(638476));
    }

    public static int getNumberOfDigits(int number) {
        char[] digits = String.valueOf(Math.abs(number)).toCharArray();
        return digits.length;
    }
}

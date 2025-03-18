package class_problems;

public class StringReverser {
    public static void main(String[] args) {
        String str = "HELLO";
        String reversed = "";

        // for (int i = 0; i < str.length(); i++) {
        for (int i = str.length() - 1; i >= 0 ; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);
    }
}

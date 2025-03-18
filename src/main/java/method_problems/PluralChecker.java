package method_problems;

public class PluralChecker {
    public static void main(String[] args) {
        System.out.println(isPlural("changes"));
        System.out.println(isPlural("change"));
        System.out.println(isPlural("dudes"));
        System.out.println(isPlural("magic"));
    }

    public static boolean isPlural(String word) {
        if (word.charAt(word.length() - 1) == 's') {
            return true;
        }
        return false;
    }
}

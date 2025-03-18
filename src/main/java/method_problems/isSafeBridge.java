package method_problems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class isSafeBridge {
    public static void main(String[] args) {
        System.out.println(isSafeBridge("####"));
        System.out.println(isSafeBridge("## ####"));
        System.out.println(isSafeBridge("#"));
        System.out.println(isSafeBridge("### ####"));
        System.out.println(isSafeBridge("#####"));
    }

    public static boolean isSafeBridge(String bridge) {
        Pattern pattern = Pattern.compile("\\s");
        Matcher matcher = pattern.matcher(bridge);
        return !matcher.find();
    }
}

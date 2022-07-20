import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherVerifier {
    public static void main(String[] args) {
        String patternStr = "\\d{9}";
        String invalidPhoneNumber = "1234567857";

        System.out.println("Verification result: " + invalidPhoneNumber.matches(patternStr));
    }
}

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {
    public static final String TEXT_TEST = "This is my small example string which I'm going to use for pattern matching.";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(TEXT_TEST);

        while (matcher.find()){
            System.out.println("** " + matcher.group());
        }
    }
}

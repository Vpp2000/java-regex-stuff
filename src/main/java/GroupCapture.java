import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroupCapture {
    public static final String TEXT_TEST = "  Juan 1500  Victor   5625   Jose 200  Victor 1230  Jose  2000";

    public static void main(String[] args) {
        Map<String, Integer> amountByName = new HashMap<>();

        String patternStr = "((\\w+)\\s+(\\d+))";
        Pattern pattern = Pattern.compile(patternStr);
        Matcher matcher = pattern.matcher(TEXT_TEST);

        String name;
        Integer amount;

        // GROUP COUNT STARTS AT 1, NOT 0
        while (matcher.find()){
            name = matcher.group(2);
            amount = Integer.parseInt(matcher.group(3));

            if(amountByName.containsKey(name)){
                amount += amountByName.get(name);
                amountByName.put(name, amount);
            } else {
                amountByName.put(name, amount);
            }
        }

        amountByName.forEach((key, val) -> { System.out.println("name " + key + "  val:  " + val);});

    }
}

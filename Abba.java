import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Abba {
    public static void main(String[] args) {
        String text = "aba aba a!a abba adca abea";
        Pattern pattern = Pattern.compile("[a..a]");
        Matcher matcher = pattern.matcher(text);

        }
    }

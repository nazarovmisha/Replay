import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replace {
    public static void main(String[] args) {


        String text = "Иван Петров";
        Pattern pattern = Pattern.compile("(.*) (.*)");
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.replaceFirst("$2 $1"));
    }
}

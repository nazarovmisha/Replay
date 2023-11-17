import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextCleaner {
    public static void main(String[] args) {
        String text = "<strike>Это удалить!</strike>А это хороший текст, " +
                "его трогать не надо.<strike> и это не нужно!</strike>";
        Pattern pattern = Pattern.compile("<strike>.*?</strike>");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            int start = matcher.start();
            int end  = matcher.end();
            System.out.println("Found much \n" + text.substring(start,end) + "\n from" + start + "to" + (end-1));
        }
        System.out.println("Clean all text");
        System.out.println(matcher.replaceAll(""));
    }
}

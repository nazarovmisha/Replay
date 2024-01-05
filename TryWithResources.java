import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
    static String input() {
        String s = null;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            s=reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();

        }
        return s;
    }
}

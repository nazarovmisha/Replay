import java.util.*;
import java.util.ArrayList;

public class SortedArrays {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        List<String> filtred = new ArrayList<>();
        for (String s : list) {
            if (s.length() == 4) {
                filtred.add(s);
            }
        }
        Collections.sort(filtred);
        Iterator<String> iter = filtred.iterator();
        if (iter.hasNext()) {
            System.out.println(iter.next());
        }
        if (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}

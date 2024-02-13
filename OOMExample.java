import java.util.LinkedList;
import java.util.List;

public class OOMExample {
    public static void main(String[] args) {
        List<Object> objects=new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            objects.add(new byte[1024*1204]);
        }
        System.out.println("Success!");
    }
}

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Food {
    public static void main(String[] args) {
        Map<String, Object> foodData = new ConcurrentHashMap<>();
        foodData.put("penguin", 1);
        foodData.put("flamingo",2);
        System.out.println(foodData);
        for (Object key:foodData.keySet()){
           foodData.remove(key);
        }
        System.out.println(foodData);
    }
}

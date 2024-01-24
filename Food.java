
import java.util.HashMap;
import java.util.Map;


public class Food {
    public static void main(String[] args) {
        Map<String, Object> foodData = new HashMap<>();
        foodData.put("penguin", 1);
        foodData.put("flamingo",2);
        System.out.println(foodData);
        for (Object key:foodData.keySet()){
           foodData.remove(key);
        }
    }
}

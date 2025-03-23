import java.util.Map;
import java.util.HashMap;

public class LearnMaps {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        
        System.out.println(numbers);

        // Iterate over the map entries
        for (Map.Entry<String, Integer> e : numbers.entrySet()) {
            System.out.println("Key: " + e.getKey() + ", Value: " + e.getValue());
        }
        for(String key : numbers.keySet()){
            System.out.println(key);
        }
        for(int values : numbers.values()){
            System.out.println(values);
        }
    }
}

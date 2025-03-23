import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collection {
    public static void main(String[] args) {
        // Creating an ArrayList
        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(5);
        numbers.add(34);
        numbers.add(23);
        numbers.add(8);

        System.out.println("Original List: " + numbers);

        // Finding Minimum Value
        int min = Collections.min(numbers);
        System.out.println("Minimum Value: " + min);

        // Finding Maximum Value
        int max = Collections.max(numbers);
        System.out.println("Maximum Value: " + max);

        // Sorting in Ascending Order
        Collections.sort(numbers);
        System.out.println("Sorted in Ascending Order: " + numbers);

        // Sorting in Descending Order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted in Descending Order: " + numbers);

        // Reversing the List
        Collections.reverse(numbers);
        System.out.println("Reversed List: " + numbers);
    }
}


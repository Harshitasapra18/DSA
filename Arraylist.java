import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;  // Import Iterator

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<>();
        student.add("ramesh");
        student.add("harshi");
        System.out.println(student);

        List<Integer> marks = new ArrayList<>();
        marks.add(10);
        marks.add(20);
        marks.add(30);
        System.out.println(marks);

        List<Integer> newList = new ArrayList<>();
        newList.add(17);
        newList.add(18);

        marks.addAll(newList);
        System.out.println(marks);

        // Remove element at index 1
        marks.remove(1);
        System.out.println(marks);

        // Remove element by value (Integer 18)
        marks.remove(Integer.valueOf(18));
        System.out.println(marks);

        // Set index 2 to 100
        marks.set(2, 100);
        System.out.println(marks);

        // Get element at index 1
        System.out.println(marks.get(1));

        // Check if list contains 100
        System.out.println(marks.contains(100));

        // Iterator to traverse the list
        Iterator<Integer> it = marks.iterator();
        while (it.hasNext()) {
            System.out.println("iterator " + it.next());
        }
    }
}
 
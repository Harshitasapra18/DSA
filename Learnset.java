import java.util.HashSet;
import java.util.Set;
public class Learnset {
    public static void main(String[] args){
        Set<Integer> set=new HashSet<>();
        set.add(32);
        set.add(43);
        set.add(24);
        set.add(44);
        set.add(13);
        set.add(13);
        System.out.println(set);
        set.remove(43);
        System.out.println(set.contains(32));
        System.out.println(set);
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        set.clear();
        System.out.println(set);
        
    }
}

import java.util.Queue;
import java.util.LinkedList;
public class Hello{
    public static void main(String[] args){
        Queue<Integer> marks=new LinkedList<>();
        marks.offer(10);
        marks.offer(20);
        marks.offer(30);
        System.out.println(marks);
        System.out.println("poll: "+marks.poll());
        System.out.println(marks);
        System.out.println("peek : "+marks.peek());
        


    }
    
}

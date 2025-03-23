import java.util.Stack;
public class stack {
    public static void main(String[] args){
        Stack<String> animals=new Stack<>();
        animals.push("dog");
        animals.push("cat");
        animals.push("lion");
        animals.push("tiger");
        animals.push("fox");
        animals.push("fish");
        System.out.println("Stack : "+animals);
        System.out.println("peek : "+animals.peek());
        System.out.println("pop :  "+animals.pop());

    }
    
}

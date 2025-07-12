import java.util.Stack;
public class StackProgram {
    public static void main(String[] args) {
        Stack<Integer>s=new Stack<>();
        s.push(5);
        s.push(10);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
        System.out.println(s.empty());
    }
}

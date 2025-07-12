import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class HashSetProgram {
    public static void main(String[] args) {
    //    Set<Integer>s1=new HashSet<>();
    //    Set<Integer>s1=new LinkedHashSet<>();
       Set<Integer>s1=new TreeSet<>();
       s1.add(20);
       s1.add(15);
       s1.add(20);
       s1.add(25);
       System.out.println(s1);
       s1.remove(20); 
       System.out.println(s1);
       System.out.println(s1.contains(20));
    }
}

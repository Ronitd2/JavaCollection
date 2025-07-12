import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
public class CollectionClassProgram {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
    list.add(25);
    list.add(15);
    list.add(26);
    list.add(41);
    list.add(17);
    list.add(20);
    System.out.println("MAximum element in array :"+Collections.max(list));
    System.out.println("Minimum element in array :"+Collections.min(list));
    Collections.sort(list,Comparator.reverseOrder());
    System.out.println(list);

    }
}

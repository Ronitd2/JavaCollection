import java.util.ArrayList;
import java.util.Iterator;
class ArrayListProgram{
    public static void main(String args[])
    {
        ArrayList<String>stlist=new ArrayList<>();
        stlist.add("Hello");
        stlist.add("World");
        stlist.add("Java");
        stlist.add("Framework");

        System.out.println(stlist);
        System.out.println(stlist.size());

        ArrayList<Integer>list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(2,50);
        System.out.println(list);
        ArrayList<Integer>list2=new ArrayList<>();
        list2.add(120);
        list2.add(150);
        list.addAll(list2);
        System.out.println(list);
        list.remove(Integer.valueOf(50));
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        // list.clear();
        // System.out.println(list);
        // Iterate the ArrayList
        for(int i=0;i<list.size();i++)
        {
            System.out.println("For loop -> ["+i+"]"+list.get(i));
        }
        for(Integer I : list)
        {
            System.out.println("For Each Loop -> "+ I);
        }

        Iterator<Integer>it=list.iterator();
        while(it.hasNext())
        {
            System.out.println("Iterator -> "+it.next());
        }
    }
}
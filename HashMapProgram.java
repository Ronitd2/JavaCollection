import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class HashMapProgram {
    public static void main(String[] args) {
        // Map<String,Integer>mp=new HashMap<>();
        Map<String,Integer>mp=new TreeMap<>();
        mp.put("One", 1);
        mp.put("Two",2);
        mp.put("Three",3);
        System.out.println(mp);
        if(mp.containsKey("Two"))
        {
            mp.put("Two",34);
        }
        System.out.println(mp);
        mp.putIfAbsent("Four", 4);
        System.out.println(mp);
        mp.remove("Three");
        System.out.println(mp);
        System.out.println(mp.isEmpty());
        
        //Iteration
        for(Map.Entry<String,Integer>e : mp.entrySet())
        {
            System.out.println(e);
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        for(String key : mp.keySet())
        {
            System.out.println(key);
        }
        for(int v : mp.values())
        {
            System.out.println(v);
        }
    }
}

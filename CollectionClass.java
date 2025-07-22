import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    public int rollno;
    public String name;
    public Student(int r,String name)
    {
        this.rollno=r;
        this.name=name;
    }
    public String toString()
    {
        return "("+rollno+")"+name; 
    }
    

}


public class CollectionClass {
    public static void main(String[] args) {
        ArrayList<Student>list=new ArrayList<>();
        list.add(new Student(3,"Amay"));
        list.add(new Student(5,"Rohit"));
        list.add(new Student(2,"Kushal"));
        list.add(new Student(4,"Ajay"));
        System.out.println(list);

        //Collections.sort(list);
        Collections.sort(list, new Comparator<Student>()
        {
            public int compare(Student s1 , Student s2)
            {
                return s1.name.compareTo(s2.name);
            }
        });

        System.out.println(list);

    }
}

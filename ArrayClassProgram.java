import java.util.Arrays;
public class ArrayClassProgram {
    public static void main(String[] args) {
        int[] arr={5,7,23,56,77,90};
        int index=Arrays.binarySearch(arr, 23);
        System.out.println("Searched value is in"+index);

        int[] ar2={2,5,3,13,11,44};
        Arrays.sort(ar2);
        for(int i : ar2)
        {
            System.out.println(i);
        }
        Arrays.fill(ar2, 12);
        for(int i : ar2)
        {
            System.out.print(i+" ");
        }
    }
}

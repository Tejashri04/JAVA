import java.util.ArrayList;

public class Operations{
    public static void main(String args[]){

        ArrayList<Integer>list = new ArrayList<>();

        // Add Element 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(1,9);         // O(n)

        System.out.println(list); 

        // Get Element
        int ele = list.get(0);
        System.out.println("Element at index 0 : " + ele); 

        // Remove/Delete Element
        list.remove(2);
        System.out.println("List after removing element from index 2 : " + list); 

        // Set Element at Index
        list.set(1,10);
        System.out.println("After setting 10 at index 1 : " + list); 

        // Contains Element
        System.out.println(list.contains(100));
        System.out.println(list.contains(10));

    }
}
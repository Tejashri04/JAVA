import java.util.ArrayList;
import java.util.Collections;

public class Sort{
    public static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(8);

        System.out.println("Orginal list : "+list);
        
        Collections.sort(list);        // Ascending sort
        System.out.println(list);
        
        Collections.sort(list,Collections.reverseOrder());        // Descending sort
        System.out.println(list);
    }
}
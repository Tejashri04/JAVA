import java.util.LinkedList;         //JAVA Collection Framework

public class LLinCollection{
    public static void main(String args[]){

        // create   - objects int,float,boolean -> Integer,Float,Character
        LinkedList<Integer> ll = new LinkedList<>();

        // add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);

        // print
        System.out.println(ll);

        // remove
        ll.removeLast();
        ll.removeFirst();

        System.out.println(ll);

    }
}
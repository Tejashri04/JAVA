public class DetectCycle{

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    } 

    public static Node head;
    public static Node tail;    

    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            // Cycle exist
            if(slow == fast){
                return true;
            }
        } 

        // Cycle doesn't exist
        return false;
    }

    public static void main(String args[]){
        DetectCycle ll = new DetectCycle();
        
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;
        // 1 -> 2 -> 3 -> 1
        System.out.println(isCycle());       

    }
}
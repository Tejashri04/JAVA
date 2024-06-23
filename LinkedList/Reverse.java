public class Reverse{

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
    public static int size;

    public void addFirst(int data){ 
        // step 1 : create new node
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        // step 2 : newNode next = head
        newNode.next = head;        // link

        // step 3 : head = newNode 
        head = newNode;         
    } 

    public void addLast(int data){
        // step 1 : create new node
        Node newNode = new Node(data);
        size++;

        if(head == null){
            head = tail = newNode;
            return;
        }

        // step 2
        tail.next = newNode;

        // step 3
        tail = newNode;
    } 

    public void print(){
        // Base case
        if(head == null){
            System.out.println("Linked List is Empty");
            return;
        }

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } 
        System.out.println("null");
    }

    public void add(int idx,int data){
        if(idx == 0){
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        } 

        // i = idx - 1 ; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    } 

    // O(N)
    public void reverse(){
        Node prev = null;
        Node curr = tail =  head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String args[]){
        Reverse ll = new Reverse();
        
        ll.addFirst(2);
        ll.addFirst(1); 
        ll.addLast(3);
        ll.addLast(4);        
        ll.add(4,5);       

        ll.print();
        ll.reverse();
        ll.print();
    }
}
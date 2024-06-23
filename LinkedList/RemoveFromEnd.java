public class RemoveFromEnd{

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

    public void deleteNthfromEnd(int n){
        // calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++; 
        } 

        if(n == sz){
            head = head.next;       // Remove First Node i.e. Last node from End
            return;
        } 

        // 
        int i = 1;
        int indexToFind = sz - n;
        Node prev = head;
        while(i < indexToFind){
            prev = prev.next;
            i++;
        } 

        prev.next = prev.next.next;
    }

    public static void main(String args[]){
        RemoveFromEnd ll = new RemoveFromEnd();
        
        ll.addFirst(2);
        ll.addFirst(1); 
        ll.addLast(3);
        ll.addLast(4);        
        ll.add(4,5);       

        ll.print();
        ll.deleteNthfromEnd(3);
        ll.print();
    }
}
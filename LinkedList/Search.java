public class Search{

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

    // Iterative Search -> O(n)
    public static int IterativeSearch(int key){
        Node temp = head;
        int i = 0;

        while(temp != null){
            if(temp.data == key){     // key Found
                return i;
            } 
            temp = temp.next;
            i++;
        } 

        // key not found
        return -1;
    } 


    // Recursive Search  -> O(n)

    // helper fun
    public int helper(Node head,int key){
        if(head == null){
            return -1;
        } 
        if(head.data == key){
            return 0;
        } 
        int idx = helper(head.next,key);
        if(idx == -1){
            return -1;
        } 
        
        return idx+1;
    } 

    public int RecursiveSearch(int key){
        return helper(head,key);
    }


    public static void main(String args[]){
        Search ll = new Search();
        
        ll.addFirst(2);
        ll.addFirst(1); 
        ll.addLast(3);
        ll.addLast(4);        
        ll.add(4,5);       

        System.out.println(ll.IterativeSearch(3));
        System.out.println(ll.IterativeSearch(30));

        System.out.println(ll.RecursiveSearch(3));
        System.out.println(ll.RecursiveSearch(30));

    }
}
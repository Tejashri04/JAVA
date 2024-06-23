public class CheckForPalindrome{

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

    // slow fast approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        } 
        return slow;    // slow is midNode
    } 

    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }

        // step 1 : Find Mid
        Node midNode = findMid(head);

        // step 2 : reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        Node right = prev;       // right half head
        Node left = head;
        // step 3 : check left half & right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        } 
        return true;

    }


    public static void main(String args[]){

        CheckForPalindrome l = new CheckForPalindrome();
        l.addFirst(2);
        l.addFirst(1); 
        l.addLast(2);
        l.addLast(1);   
        l.print();
        System.out.println(l.checkPalindrome());      
              
    }
}
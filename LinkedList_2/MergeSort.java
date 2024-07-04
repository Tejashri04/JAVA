import java.util.*;
// time complexity - O(n log n)
public class MergeSort{
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

    public void addFirst(int data){ 
        // step 1 : create new node
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        // step 2 : newNode next = head
        newNode.next = head;        // link

        // step 3 : head = newNode 
        head = newNode;         
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



    public static Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;     // Mid Node
    }

    public static Node merge(Node head1,Node head2){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergeLL.next;

    }

    public static Node mergeSort(Node head){
        // base case
        if(head == null || head.next == null){
            return head;
        }

        // find mid
        Node mid = getMid(head);

        // left & right half MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge
        return merge(newLeft,newRight);
    }

    public static void main(String args[]){
        MergeSort ll = new MergeSort();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        // 5 -> 4 -> 3 -> 2 -> 1 

        ll.print();
        ll.head = mergeSort(ll.head);
        ll.print();

    }
}
// Swapping Nodes in a Linked List

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
} 

class SwapKeys{
    Node head;

    public void swapNodes(int x,int y){
        if(x == y){
            return ;
        }

        Node prevX = null,currX = head;
        while(currX != null && currX.data != x){
            prevX = currX;
            currX = currX.next;
        } 
       
        Node prevY = null,currY = head;
        while(currY != null && currY.data != y){
            prevY = currY;
            currY = currY.next;
        } 

        if(currX == null || currY == null){
            return;
        } 

        if(prevX != null){
            prevX.next = currY;
        }
        else{
            head = currY;
        } 

        if(prevY != null){
            prevY.next = currX;
        }
        else{
            head = currX;
        } 

        Node temp = currX.next;
        currX.next = currY.next;
        currY.next = temp;
    }

    public void push(int new_data){
        Node newNode = new Node(new_data);
        newNode.next = head;
        head = newNode;
    } 

    public void printList(){
        Node tNode = head;
        while(tNode != null){
            System.out.print(tNode.data + " -> ");
            tNode = tNode.next;
        }
        System.out.println("null");
    } 

    public static void main(String args[]){
        SwapKeys list = new SwapKeys();

        list.push(7);
        list.push(6);
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);

        System.out.println("Linked List Before : " );
        list.printList();

        list.swapNodes(4,3);

        System.out.println("Linked List after : ");
        list.printList();
    }
}
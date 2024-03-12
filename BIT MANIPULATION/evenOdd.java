public class evenOdd{
    public static void even_odd(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println(n + " is Even");
        }
        else{
            System.out.println(n + " is Odd");
        }
    }
    public static void main(String args[]){
        even_odd(1);
        even_odd(2);
        even_odd(3);
        even_odd(4);
    }
}
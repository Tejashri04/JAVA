// Swap two numbers without using third variable

public class swap{
    public static void main(String args[]){
        int x = 3 , y = 4;

        System.out.println("Before swap : x = " + x + " and y = " + y);

        //swap using XOR
        x = x ^ y ;
        System.out.println(x);
        y = x ^ y ;
        System.out.println(y);
        x = x ^ y ; 
        System.out.println(x);

        System.out.println("After swap : x = " + x + " and y = " + y);
    }
}
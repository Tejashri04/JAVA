import java.util.*;

public class Power{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base: ");
        double base = sc.nextDouble();

        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();

        double result = 1;
        int counter = 0;

        while (counter < exponent) {
            result *= base;
            counter++;
        }

        System.out.println(result);
    }
}
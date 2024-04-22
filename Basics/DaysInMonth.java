import java.util.*;

public class DaysInMonth{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a month number(1-12) : ");
        int n = sc.nextInt();

        switch(n){
            case 1,3,5,7,8,10,12 : System.out.println("31 days");
                                   break;
            
            case 4,6,9,11  : System.out.println("30 days");
                             break; 

            case 2 : System.out.println("Is it a leap year? (true/false):");
                    boolean isLeapYear = sc.nextBoolean();
                    if (isLeapYear) {
                        System.out.println("29 days");
                    } else {
                        System.out.println("28 days");
                    }
                    break;
            default:
                    System.out.println("Invalid month number");
                    return;
        }
    }
}
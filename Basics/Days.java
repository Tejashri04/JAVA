import java.util.*;

public class Days{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of days : ");
        int totalDays = sc.nextInt();

        int years = totalDays / 365;
        int remainingDays = totalDays % 365;
        int weeks = remainingDays / 7;
        int days = remainingDays % 7;

        System.out.println(totalDays + " days is equivalent to:");
        System.out.println(years + " years");
        System.out.println(weeks + " weeks");
        System.out.println(days + " days");
    }
}
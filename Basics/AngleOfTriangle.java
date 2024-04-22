import java.util.*;

public class AngleOfTriangle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two angles of a triangle");
        double a1 = sc.nextDouble();
        double a2 = sc.nextDouble();

        System.out.println("Third angle of a triangle is : "+(180-a1-a2));
    }
}
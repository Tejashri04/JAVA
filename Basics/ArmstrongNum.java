import java.util.Scanner;

public class ArmstrongNum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scanner.nextInt();
        
        int temp = num;
        int count = (int)Math.log10(num) + 1;
        int digit = 0;
        int sum = 0;

        while(num > 0){
            digit = num % 10;
            sum = sum + (int)Math.pow(digit,count);
            num = num / 10;
        } 

        if(temp == sum){
            System.out.println("Armstrong Num");
        }
        else{
            System.out.println("Not a Armstrong Num");
        }
    }
} 



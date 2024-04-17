public class SwitchArrow{
    public static void main(String args[]){
        int num = 2;

        switch(num){
            case 1 -> System.out.println("one"); // No need of break statement
            case 2 -> System.out.println("two");
            case 3 -> System.out.println("three");
            case 4 -> System.out.println("four");
            default -> System.out.println("Invalid Input");
        }  
    }
}
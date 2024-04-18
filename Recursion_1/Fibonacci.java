public class Fibonacci{
    public static int printNthTerm(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fbn = printNthTerm(n-1) + printNthTerm(n-2);
        return fbn;
    }

    public static void main(String args[]){
        int n = 5;
        System.out.println(printNthTerm(n));
    }
}
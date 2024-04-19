public class OptimalPower{
    public static int printPower(int x,int n){
        if(n == 0){
            return 1;
        }
        int halfPower = printPower(x,n/2);
        int halfPowerSq = halfPower + halfPower;

        // n is odd
        if(n % 2 != 0){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String args[]){
        System.out.println(printPower(2,5));
    }
}
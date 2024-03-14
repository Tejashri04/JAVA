// Check if a number is power of 2 or not

public class powerOfTwo{
    public static boolean isPowerOfTwo(int n){
        return ((n & (n-1)) == 0);
    }

    public static void main(String args[]){
        System.out.println(isPowerOfTwo(4));
        System.out.println(isPowerOfTwo(5));
    }
}
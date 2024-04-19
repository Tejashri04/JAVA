public class Power{
    public static int printPower(int x,int n){
        if(n == 0){
            return 1;
        }
        int res = x * printPower(x,n-1);
        return res;
    }

    public static void main(String args[]){
        System.out.println(printPower(2,3));
    }
}
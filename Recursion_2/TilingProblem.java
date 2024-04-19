public class TilingProblem{
    public static int findWays(int n){
        // base case
        if(n == 0 || n == 1){
            return 1;
        } 

        // vertical choice
        int fnm1 = findWays(n-1);

        // horizontal choice
        int fnm2 = findWays(n-2);

        int totalWays = fnm1 + fnm2;

        return totalWays;
    }

    public static void main(String args[]){
        System.out.println(findWays(4));
    }
}
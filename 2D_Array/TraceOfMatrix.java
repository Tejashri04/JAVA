public class TraceOfMatrix{
    public static void main(String args[]){
        int a[][] = {{1,2,3},{0,6,8},{0,0,9}};

        int sum = 0;
        for(int i = 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[0].length ; j++){
                if(i == j){
                    sum += a[i][i];
                }
            }
        }
        System.out.println(sum);
    }
}
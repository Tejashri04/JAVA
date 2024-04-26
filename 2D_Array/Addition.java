public class Addition{
    public static void main(String args[]){
        int a[][] = {{1,2,3},{4,5,6}};
        int b[][] = {{1,2,3},{4,5,6}};
        int c[][] = new int[2][3];

        
        for(int i= 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[0].length ; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        } 

        System.out.println("Addition of two matrices : ");
        for(int i= 0 ; i < a.length ; i++){
            for(int j = 0 ; j < a[0].length ; j++){
                System.out.print(c[i][j] + " ");
            }
             System.out.println();
        }
    }
}
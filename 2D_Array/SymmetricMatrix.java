import java.util.*;

public class SymmetricMatrix{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter total no. of rows : ");
        int r = sc.nextInt(); 

        System.out.println("Enter total no. of columns : ");
        int c = sc.nextInt(); 

        int a[][] = new int[r][c];
        int flag = 0;


        if(r == c){
            System.out.println("Enter array elements : ");
            for(int i = 0 ; i < r ; i++){
                for(int j = 0 ; j < c ; j++){
                    a[i][j] = sc.nextInt();
                }
            }

            for(int i = 0 ; i < r ; i++){
                for(int j = 0 ; j < c ; j++){
                    if(a[i][j] != a[j][i]){
                        flag = 1;
                        break;
                    }
                }
                 if (flag == 1) {
                    break;
                }
            }

            if(flag == 0){
                System.out.println("Symmetric Matrix");
            }
            else{
            System.out.println("Not a Symmetric Matrix");
            }
        }
        else{
            System.out.println("Can't be a Symmetric Matrix");
        } 

        
    
    }
}
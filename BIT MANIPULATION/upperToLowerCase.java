// Convert uppercase characters to lowercase using bits

public class upperToLowerCase{
    public static void main(String args[]){

        //Convert uppercase character to lowercase 
        for(char ch = 'A' ; ch <= 'Z' ; ch++){
            System.out.println((char)(ch | ' '));
        }
    }
}
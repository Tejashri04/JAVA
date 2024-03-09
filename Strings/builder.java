public class builder{
    public static void main(String args[]){
        StringBuilder sb2 = new StringBuilder("");
        sb2.toString();
        for(char ch = 'a' ; ch <= 'z' ; ch++){
            sb2.append(ch);
        } 
        
        System.out.println(sb2);
    }
}
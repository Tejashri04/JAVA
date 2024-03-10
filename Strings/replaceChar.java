public class replaceChar{
    public static void main(String args[]){
        String str = "Hello World".replace("e","a");
        System.out.println(str); 

        String str2 = "Hello hunny bunny".replace("nny","n");
        System.out.println(str2); 

        String str3 = "Hello hunny bunny".replaceAll("nny","n");
        System.out.println(str3); 

        String str4 = "Hello hunny bunny".replaceFirst("nny","n");
        System.out.println(str4); 


    }
}
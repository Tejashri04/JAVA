// Count how many times lowercase vowels occured in a String entered by the user

public class countVowels{
    public static int countLower(String str){
        int count = 0;
        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]){
        String str = "hi i am tejashri";
        System.out.println("vowels occurs " + countLower(str) + " times");
    }
}
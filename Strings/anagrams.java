public class anagrams{
    public static boolean isAnagrams(String str1,String str2){
        if(str1.length() == str2.length()){
            for(int i = 0 ; i < str1.length() ; i++){
                for(int j = 0 ; j < str2.length() ; j++){
                    if(str1.charAt(i) != str2.charAt(j)){
                        continue;
                    }
                    
                }
                
            }
            return true;
        } 
        return false;
    }
    public static void main(String args[]){
        String str1 = "race";
        String str2 = "care";
        System.out.println(isAnagrams(str1,str2)); 
    }
}
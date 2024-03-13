public class operations{
    
    // get i^th bit
    public static int get_iBit(int n , int i){
        int bitMask = 1 << i;
        if((n & bitMask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    } 

    // set i^th bit
    public static int set_iBit(int n , int i){
        int bitMask = 1 << i;
        return n | bitMask;
    }

    // clear i^th bit
    public static int clear_iBit(int n , int i){
        int bitMask = ~(1 << i);
        return n & bitMask;
    }
    public static void main(String args[]){
        
        System.out.println(get_iBit(10,2));

        System.out.println(set_iBit(10,2));

        System.out.println(clear_iBit(10,1));
    }
}
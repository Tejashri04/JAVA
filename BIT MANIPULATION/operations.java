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

    // update i^th bit
    public static int update_iBit(int n , int i, int newBit){
        if(newBit == 0){
            return clear_iBit(n,i);
        }
        else{
            return set_iBit(n,i);
        }
    } 

    // clear i bits
    public static int clear_iBits(int n , int i){
        int bitMask = (~0) << i;
        return n & bitMask;
    } 

    // clear bits in range
    public static int clear_bitsInRange(int n , int i , int j){
        int a = ((~0) << (j+1));
        int b = (1 << i) - 1;
        int bitMask = a | b ;
        return n & bitMask;
    }

    public static void main(String args[]){
        
        System.out.println(get_iBit(15,2));

        System.out.println(set_iBit(10,2));

        System.out.println(clear_iBit(10,1));

        System.out.println(update_iBit(10,2,1));

        System.out.println(clear_iBits(15,2));

        System.out.println(clear_bitsInRange(10,2,4));
    }
}
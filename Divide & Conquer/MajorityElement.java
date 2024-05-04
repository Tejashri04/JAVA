public class MajorityElement{
    private static int countInRange(int[] nums,int num,int low,int high){
        int count = 0;

        for(int i = low ; i <= high ; i++){
            if(nums[i] == num){
                count++;
            }
        }
        return count;
    } 

    private static int majorityElementRec(int[] nums,int low,int high){
        if(low == high){
            return nums[low];
        }

        int mid = (high - low) / 2 + low;
        int left = majorityElementRec(nums,low,mid);
        int right = majorityElementRec(nums,mid+1,high);

        if(left == right){
            return left;
        }

        int leftCount = countInRange(nums,left,low,high);
        int rightCount = countInRange(nums,right,low,high);

        return leftCount > rightCount ? left : right;
    } 

    public static int majorityEle(int[] nums){
        return majorityElementRec(nums,0,nums.length-1);
    }
    

    public static void main(String args[]){
        int nums[] = {2,2,1,1,2,2};

        System.out.println(majorityEle(nums));
    }
}
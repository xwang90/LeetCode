public class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums==null||nums.length==0)
           return 0;
           
        int left=0;
        int right=nums.length-1;
        int m;
        
        while(left<=right)
        {
            m=(left+right)/2;
            if(nums[m]==target) 
               return m;
            else if(nums[m]<target)
               left = m+1;
            else
               right = m-1;
            
        }
        
        return left;
    }
}
public class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> result = new ArrayList<String>();
        
        int start=0;
        int end=0;
        
        if(nums==null||nums.length==0)
        {
            return result;
        }
        
        
        StringBuilder sb= new StringBuilder();
        sb.append(nums[0]);
        
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=nums[i-1]+1)
            {
                end = i-1;
                if(start==end)
                result.add(sb.toString());
                else
                {
                sb.append("->");    
                sb.append(nums[i-1]);
                result.add(sb.toString());
                }
                
                sb.setLength(0);//clear the StringBuilder instance
                sb.append(nums[i]);
                start = i;
            }
            
        }
        
        if(start!=nums.length-1)
        {
          sb.append("->");
          sb.append(nums[nums.length-1]);
          result.add(sb.toString());
        }
        else
        {
           result.add(sb.toString());  
        }
        
          return result;
        
    }
}
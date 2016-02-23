public class Solution {
    public boolean isPowerOfThree(int n) {
        int temp1 =n;
        int temp2 =0;
        
        
        
        if(n<=0)
           return false;
        
        while(temp2==0)
        {
            if(temp1==1)
            break;
            
            temp2=temp1%3;
            temp1=temp1/3;
        }
        
        if(temp2!=0)
           return false;
        else
           return true;
        
    }
}
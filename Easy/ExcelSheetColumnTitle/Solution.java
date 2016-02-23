public class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb=new StringBuilder();
        int temp1=n;
        int temp2=0;
        
        
        while(temp1!=0)
        {
            temp1--;
            temp2=temp1%26;
            temp1=temp1/26;
            
            sb.insert(0,(char)('A'+temp2));
        }
        
        return sb.toString();
        
        
    }
    
    
    
}
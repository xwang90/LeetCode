public class Solution {
    public int titleToNumber(String s) {
        
        if(s==null||s.length()==0)
           return 0;
        
        int result = 0;
        for(int i=0; i<s.length();i++)
        {
            if(i==(s.length()-1))
            result = result+(int)(s.charAt(i)-'A'+1);
            else
            result= (result+(int)(s.charAt(i)-'A'+1))*26;
        }
    
           return result;
        
    }
}
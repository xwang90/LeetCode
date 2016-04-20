public class Solution {
    public String convert(String s, int numRows) {
        if(s==null||s.length()==0||s.length()==1||numRows==1||s.length()<=numRows) return s;
        
        StringBuilder sb=new StringBuilder();
        
        for(int i=0;i<numRows;i++)
        {
            sb.append(s.charAt(i));
            int j=i;
            for(int k=0;;k++)
            {
               if(k%2==0)
               {
                  j=j+2*(numRows-i-1); 
                  if(j<s.length()&&(numRows-i-1)!=0)
                    sb.append(s.charAt(j));
                  else if((numRows-i-1)==0)
                    continue;
                  else if(j>=s.length())
                    break; 
               }
               else
               {
                  j=j+2*i; 
                  if(j<s.length()&&i!=0)
                    sb.append(s.charAt(j));
                  else if(i==0)
                    continue;
                  else if(j>=s.length())
                    break;                    
               }
               
        }

        }
        
        return sb.toString();
        
  }
}
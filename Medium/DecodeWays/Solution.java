public class Solution {
    private HashMap<Integer,Integer> helpMap=new HashMap<Integer,Integer>();
     
    public int numDecodings(String s) {
        if(s==null||s.length()==0) return 0;
        
        if(s.length()==1)
        {
          if(s.charAt(0)=='0')
             return 0;
          else
             return 1;
        }
        
        if(s.length()==2)
        {
            if(Integer.parseInt(s)==0||s.charAt(0)=='0'||s.charAt(1)=='0'&&Integer.parseInt(s)>26)
               return 0;
            else if(Integer.parseInt(s)<=26&&!(s.charAt(0)=='0'||s.charAt(1)=='0')) 
               return 2;
            else 
               return 1;
        }
        
        return helper(s,s.length()-1);
        
        
    }
    
    int helper(String s,int index)
    {
        int result;
        
        if(index==0) 
        {
          if(s.charAt(0)=='0')
             return 0;
          else
             return 1;
        }
        
        if(index==1)
        {
            String ss=s.substring(0,2);
            if(Integer.parseInt(ss)==0||ss.charAt(0)=='0'||ss.charAt(1)=='0'&&Integer.parseInt(ss)>26)
               return 0;
            else if(Integer.parseInt(ss)<=26&&!(ss.charAt(0)=='0'||ss.charAt(1)=='0')) 
               return 2;
            else 
               return 1;
        }
        
        if(helpMap.containsKey(index)) return helpMap.get(index);
        
        String ssLastTwo=s.substring(index-1,index+1);
        
        if(Integer.parseInt(ssLastTwo)==0||ssLastTwo.charAt(1)=='0'&&Integer.parseInt(ssLastTwo)>26)
        {
           result=0; 
        }
        else if(Integer.parseInt(ssLastTwo)<=26&&Integer.parseInt(ssLastTwo)>0&&!(ssLastTwo.charAt(0)=='0'||ssLastTwo.charAt(1)=='0'))
        {
            result = helper(s,index-2)+helper(s,index-1);
        }
        else if(Integer.parseInt(ssLastTwo)<=26&&Integer.parseInt(ssLastTwo)>0&&(ssLastTwo.charAt(0)!='0'||ssLastTwo.charAt(1)=='0'))
        {
            result= helper(s,index-2);
        }
        else
        {
            result = helper(s,index-1); 
        }
           
           helpMap.put(index,result);
        
           return result;
        
        
       
       
    }
    
}
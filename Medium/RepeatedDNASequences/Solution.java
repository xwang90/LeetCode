public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result= new ArrayList<String>();
        
        if(s==null||s.length()<11) return result;
        
        int size=s.length();
        
        HashMap<String,Integer> m=new HashMap<String,Integer>();
        for(int i=0;i<=size-10;i++)
        {
            String ss=s.substring(i,i+10);
            if(m.containsKey(ss))
            {
                m.put(ss,m.get(ss)+1);
            }
            else
            {
                m.put(ss,1);
            }
        }        
        
        for(Map.Entry<String,Integer> e: m.entrySet())
        {
            if(e.getValue()>1)
               result.add(e.getKey());
            
        }
        
        return result;
        
        
    }
}
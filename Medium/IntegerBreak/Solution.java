public class Solution {
    HashMap<Integer,Integer> helpMap= new HashMap<Integer,Integer>();
    public int integerBreak(int n) {
          
          int max=1;
        
          for(int i=1;i<n;i++)
          {
              int product=i*maxProduct(n-i);
              
              if(product>max) max=product;
          }
          
          return max;
    }
    
    int maxProduct(int m)
    {
        if(m==1) return 1;
        
        if(m==2) return 2;
        
        if(helpMap.containsKey(m)) return helpMap.get(m);
        
        int max=m;
        
        for(int i=1;i<m;i++)
        {
              int product=i*maxProduct(m-i);
              
              if(product>max) max=product;
        }
        
        helpMap.put(m,max);
          
          return max;
    }
    
}
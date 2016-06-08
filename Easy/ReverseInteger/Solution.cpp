class Solution {
public:
    int reverse(int x) {
        if(x==0) return x;
        
        bool isNegative=false;
        
        if(x<0)
        {
          if(x>INT_MIN)
            isNegative=true;
          else
            return 0;
        }
        
        if(isNegative) x=x*(-1);
        
        int a=x;
        int b=0;
        int result=0;
        
        while(a!=0)
        {
            b=a%10;
            if(result>(INT_MAX/10))//Prevent overflow
            {
                return 0;
            }
            else
            {
              result=result*10+b;
            }
            
            a=a/10;
        }
        
        return isNegative? result*(-1):result;          
    }
};
class Solution {
private:
    unordered_map<int,bool> helperMap;
    
public:
    bool isHappy(int n) {
        if(helperMap.find(n)!=helperMap.end())
        {
            return helperMap[n];
        }
        
        int a=n;
        int b=0;
        int squareSum=0;
        bool result;
        
        while(a/10!=0)
        {
            b=a%10;
            a=a/10;
            squareSum+=b*b;
        }
        
        squareSum+=a*a;
        
        if(squareSum==1) 
        {
            result=true;
            helperMap[n]=true;
        }
        else
        {
            helperMap[n]=false;
            result=isHappy(squareSum);
        }
        
        return result;
    }
};
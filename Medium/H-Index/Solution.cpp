class Solution {
public:
    int hIndex(vector<int>& citations) {
        
        int vSize=citations.size();
        
        if(vSize==0) return 0;
        
        if(vSize==1)
        {
            if(citations[0]>=1) return 1;
            else return 0;
        }
        
        sort(citations.begin(),citations.end());
        
        int left=0;
        int right=citations.size()-1;
        int mid;
        int result;
        
        while(left<=right)
        {
            mid=left+(right-left)/2;
            
            if(citations[mid]==vSize-mid) return vSize-mid;
            else if(citations[mid]>vSize-mid) 
            {
              result=vSize-mid;
              right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        
        return result;             
        
    }
};
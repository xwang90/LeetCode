class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
         unordered_set<int> s;
         
         for(auto e: nums)
         {
            if(s.count(e))
               return true;
            else 
               s.insert(e);
         }
         
         return false;
    
        
    }
};
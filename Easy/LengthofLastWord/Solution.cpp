class Solution {
public:
    int lengthOfLastWord(string s) {
        
        if(s.size()==0) return 0;
        
        vector<string> v;
        istringstream iss(s);
        
        string tmp;
        
        while(iss>>tmp)
        {
           v.push_back(tmp); 
        }
        
        if(v.size()==0)
           return 0;
        else
           return v.back().size();
    }
};
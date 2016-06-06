class Solution {
private:
    bool isVowel(char c)
    {
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
           return true;
        else 
           return false;
    }
public:
    string reverseVowels(string s) {
        if(s.size()==0||s.size()==1) return s;
        
        int i=0;
        int j=s.size()-1;
        
        while(i<j)
        {
            if(isVowel(s[i])) 
            {
               if(isVowel(s[j])) 
               {
                   char tmp;
                   tmp=s[i];
                   s[i]=s[j];
                   s[j]=tmp;
                   i++;
                   j--;
               }
               else
               {
                   j--;
               }
            }
            else
            {
               if(isVowel(s[j])) 
               {
                   i++;
               }
               else
               {
                   i++;
                   j--;
               }
            }
        }
        
        return s;
    }
};
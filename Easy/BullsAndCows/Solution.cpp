class Solution {
public:
    string getHint(string secret, string guess) {
        unordered_map<char,int> secretMap;
        unordered_map<char,int> guessMap;
        unordered_map<char,int> secretBullMap;
        
        int bull=0;
        int cow=0;
        
        for(int i=0;i<secret.size();i++)
        {
            if(secretMap.find(secret[i])==secretMap.end())
            {
                 secretMap[secret[i]]=1;           
            }
            else
            {
                 int count=secretMap[secret[i]];
                 count++;
                 secretMap[secret[i]]=count;
            }
            
            if(guessMap.find(guess[i])==guessMap.end())
            {
                 guessMap[guess[i]]=1;           
            }
            else
            {
                 int count=guessMap[guess[i]];
                 count++;
                 guessMap[guess[i]]=count;
            }
            
            if(secret[i]==guess[i])
            {
               if(secretBullMap.find(secret[i])==secretBullMap.end())
               {
                  secretBullMap[secret[i]]=1;           
               }
               else
               {
                  int count=secretBullMap[secret[i]];
                  count++;
                  secretBullMap[secret[i]]=count;
               } 
            }
        }
        
        for(auto it=secretMap.begin();it!=secretMap.end();it++)
        {
            if(guessMap.find(it->first)==guessMap.end()) 
            {
               continue;
            }
            else
            {
                if(secretBullMap.find(it->first)!=secretBullMap.end())
                {
                   cow+=min(it->second,guessMap[it->first])-secretBullMap[it->first];
                   bull+=secretBullMap[it->first];
                }
                else
                   cow+=min(it->second,guessMap[it->first]);
            }
        }
        
        return to_string(bull)+"A"+to_string(cow)+"B";
    }
};
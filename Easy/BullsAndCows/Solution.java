import java.util.HashMap;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getHint("1807","7810"));
	}

	public static String getHint(String secret, String guess) {
        if(secret==null||guess==null) return null;
        
        int bull=0;
        int cow=0;
        int sum=0;
        char[] secretArray=secret.toCharArray();
        char[] guessArray=guess.toCharArray();
        Integer count=0;
        Integer countGuess=0;
        HashMap<Character,Integer> secretMap=new HashMap<Character,Integer>();
        HashMap<Character,Integer> guessMap=new HashMap<Character,Integer>();
        int size=secretArray.length;
        for(int i=0;i<size;i++)
        {
           if(secretMap.containsKey(secretArray[i]))
           {
               count=secretMap.get(secretArray[i]);
               count++;
               secretMap.put(secretArray[i],count);
           }
           else
           {
               secretMap.put(secretArray[i],1);
           }
           
           if(guessMap.containsKey(guessArray[i]))
           {
               count=guessMap.get(guessArray[i]);
               count++;
               guessMap.put(guessArray[i],count);
           }
           else
           {
               guessMap.put(guessArray[i],1);
           }
           
           
           if(secretArray[i]==guessArray[i])
              bull++;
        }
        
        for(Character secretChar: secretMap.keySet())
        {
            count=secretMap.get(secretChar);
            
            if(guessMap.containsKey(secretChar))
            {
               countGuess=guessMap.get(secretChar);
               sum+=Math.min(countGuess,count);
            }
            
        }
        
        cow=sum-bull;
        
        return bull+"A"+cow+"B";
        
    }
}

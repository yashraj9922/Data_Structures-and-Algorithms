package LC;

class Solution {
    public int lengthOfLastWord(String s) {
        
        //Count the last word length
        int count = 0;
        
        //To Remove spaces from start and ends of the whole string
        s = s.trim();
        
        //From start we will start to read String
        int start = s.length() - 1;
        
        for(int i=start; i >= 0; i--){
            //Until we find space, we will iterate.
            if(s.charAt(i) == ' '){
                break;
            }
            
            count++;
        }
        //This will be our answer
        return count;
    }
}

public class lengthOfLastWord {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "Hello World";
        System.out.println(sol.lengthOfLastWord(s));
    }
}
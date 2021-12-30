package LeetCodePracticeDynamicProgramming;


/**
 * Write a description of LongestNonRepeatingSubstring here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LongestNonRepeatingSubstring {
     public int lengthOfLongestSubstring(String s) {
         if(s.length() == 0) return 0;
        int max = 0, currlen = 0, i = 0;
        while(max < s.length() && i < s.length())    {
            if(s.indexOf(s.charAt(i)) == i) {
                i++;
                currlen++;
            }   else {
                max = Math.max(max, currlen);
                s = s.substring(i - currlen + 1);
                currlen = 0;
                i = 0;
            } 
            System.out.println(currlen);
            max = Math.max(max, currlen);
        }
        return max;
    }
    
    public void tester () {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
        System.out.println(s);
        System.out.println(lengthOfLongestSubstring("aab"));
        System.out.println("Ending!");
    }  
}

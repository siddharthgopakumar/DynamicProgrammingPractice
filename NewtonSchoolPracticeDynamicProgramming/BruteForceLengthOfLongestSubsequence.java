package NewtonSchoolPracticeDynamicProgramming;


/**
 * Write a description of BruteForceLengthOfLongestSubsequence here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BruteForceLengthOfLongestSubsequence {
    public int longestSubsequence (String one, String two) {
        int lOne = one.length(), lTwo = two.length();
        if(lOne == 0 || lTwo == 0)  return 0;
        
        if(one.charAt(lOne - 1) == two.charAt(lTwo - 1))    {
            return 1 + longestSubsequence(one.substring(0, lOne - 1), two.substring(0, lTwo - 1));
        }   else    {
            return Math.max(longestSubsequence(one.substring(0, lOne - 1), two), longestSubsequence (one, two.substring(0, lTwo - 1)));
        }
    }
    
    public void tester () {
        String one = "ACBC";
        String two = "ADBD";
        System.out.println(longestSubsequence(one, two));
    }

}

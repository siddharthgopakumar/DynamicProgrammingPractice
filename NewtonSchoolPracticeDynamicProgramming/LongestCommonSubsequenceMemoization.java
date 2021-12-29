package NewtonSchoolPracticeDynamicProgramming;


/**
 * Write a description of LongestCommonSubsequence here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LongestCommonSubsequenceMemoization {
    public int longestSubsequence (String one, String two, int[][] table) {
        int lOne = one.length(), lTwo = two.length();
        if(lOne == 0 || lTwo == 0)  return 0;
        if(table[lOne][lTwo] != 0)  return table[lOne][lTwo];
        
        if(one.charAt(lOne - 1) == two.charAt(lTwo - 1))    {
             table[lOne][lTwo] = 1 + longestSubsequence(one.substring(0, lOne - 1), two.substring(0, lTwo - 1), table);
             return table[lOne][lTwo];
        }   else    {
            table[lOne][lTwo] = Math.max(longestSubsequence(one.substring(0, lOne - 1), two, table), longestSubsequence (one, two.substring(0, lTwo - 1), table));
            return table[lOne][lTwo];
        }
    }
    
    public void tester () {
        String one = "ACBC";
        String two = "ADBD";
        int[][] table = new int[one.length() + 1][two.length() + 1];
        System.out.println(longestSubsequence(one, two, table));
    }

}
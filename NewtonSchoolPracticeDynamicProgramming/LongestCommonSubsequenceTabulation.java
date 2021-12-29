package NewtonSchoolPracticeDynamicProgramming;


/**
 * Write a description of LongestCommonSubsequenceTabulation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LongestCommonSubsequenceTabulation {
    public int longestCommonSubsequence (String one, String two) {
        int lone = one.length(), ltwo = two.length();
        int[][] table = new int[lone + 1][ltwo + 1];
        for(int i = 1; i <= lone; i++){
            for(int j = 1; j <= ltwo; j++)  {
                if(one.charAt(i - 1) == two.charAt(j - 1))    {
                    table[i][j] = table[i - 1][j - 1] + 1;
                }   else {
                    table[i][j] = Math.max(table[i][j - 1], table[i - 1][j]);
                }
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }  
        return table[lone][ltwo];
    }
    
    public void tester () {
        String one = "AB";
        String two = "ABF";
        System.out.println(longestCommonSubsequence(one, two));
    }

}

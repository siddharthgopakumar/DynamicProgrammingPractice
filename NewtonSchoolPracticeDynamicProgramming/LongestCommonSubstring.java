
/**
 * Write a description of LongestCommonSubstring here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LongestCommonSubstring {
    public int longestCommonSubstring(String one, String two)  {
        int size1 = one.length(), size2 = two.length();
        int maxLength = 0;
        int[][] table = new int[size1 + 1][size2 + 1];
        table[0][0] = 1;
        for(int i = 1; i <= size1; i++) {
            for(int k = 0; k <= size2; k++) {
                if(i == 0 || k == 0)    {
                    table[i][k] = 0;
                    continue;
                }
                if(one.charAt(i - 1) == two.charAt(k -1))  {
                    table[i][k] = table[i - 1][k - 1] + 1;
                } 
                maxLength = Math.max(maxLength, table[i][k]);
            }
        }
        // for(int i = 1; i <= size1; i++) {
            // for(int k = 0; k <= size2; k++) {
                // System.out.print(table[i][k] + "\t");
            // }
            // System.out.println();
        // }
        // System.out.println(maxLength);
        return maxLength;
    }
    
    public void tester() {
        longestCommonSubstring("abcdgh","acdghr");

    }
}

package NewtonSchoolPracticeDynamicProgramming;

/**
 * Write a description of MinimumMovesTabulation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MinimumMovesTabulation {
    public int minMoves(String one, String two) { 
        int lone = one.length(), ltwo = two.length();
        int[][] table = new int[lone + 1][ltwo + 1];
        for(int i = 0; i <= lone; i ++) {
            for(int j = 0; j <= ltwo; j++)  {
                if(i == 0 || j == 0) {
                    table[i][j] = i + j;
                }   else    {      
                    if(one.charAt(i - 1) == two.charAt(j - 1)) table[i][j] = table[i - 1][j - 1]; 
                    else table[i][j] = 1 + Math.min(table[i - 1][j - 1], Math.min(table[i - 1][j], table[i][j - 1]));                    
                }
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }
        return table[lone][ltwo];
    }

    public void tester () {
        String one = "geek", two = "gseke";
        System.out.println(minMoves(one, two));

    }
}

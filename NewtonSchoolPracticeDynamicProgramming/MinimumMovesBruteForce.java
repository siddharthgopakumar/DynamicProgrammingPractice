package NewtonSchoolPracticeDynamicProgramming;

/**
 * Write a description of MinimumMovesBruteForce here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MinimumMovesBruteForce {    
    public int minMoves(String one, String two) {        
        int lone = one.length(), ltwo = two.length();
        if(lone == 0)   {
            return (ltwo != 0)? ltwo:0;
        } 
        if(ltwo == 0)   {
            return (lone != 0)? lone: 0;
        }     
        int minMoves = 0;
        if(one.charAt(0) == two.charAt(0))  minMoves = minMoves(one.substring(1), two.substring(1));
        else    {
            // System.out.println("In else");
            int delete = minMoves(one.substring(1), two);
            int insert = minMoves(two.substring(0,1) + one, two);
            int replace = minMoves(two.substring(0,1) + one.substring(1), two);
            minMoves = 1 + Math.min(delete, Math.min(insert, replace));
            
        }        
        return minMoves;        
    }

    public void tester () {
        String one = "AA", two = "ABB";
        System.out.println(minMoves(one, two));
    }
}

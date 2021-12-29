package NewtonSchoolPracticeDynamicProgramming;

/**
 * Write a description of BruteForceLongestSubSequence here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BruteForcePrintingAllSubsequences {
    public String subSequence(String one, String two) {
        if(one.length() == 0|| two.length() == 0) return "";
        if(two.indexOf(one.charAt(0)) != -1)    {            
            StringBuilder sb = new StringBuilder(subSequence(one.substring(1), two.substring(two.indexOf(one.charAt(0)) + 1)));            
            return sb.append(one.charAt(0)).toString();
        }   else    {
            return subSequence(one.substring(1), two);
        }        
    }

    public void tester(){
        String one = "AGGTAB";
        String two = "GXTXAYB";
        for(int i = 0; i < one.length(); i++)   {
            StringBuilder result = new StringBuilder(subSequence(one.substring(i), two)).reverse();
            if(result.length() > 1)
                System.out.println(result);
        }       

    }

}

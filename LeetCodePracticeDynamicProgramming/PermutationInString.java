package LeetCodePracticeDynamicProgramming;

/**
 * Write a description of PermutationInString here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PermutationInString {
    public boolean isSubstring(String one, String two)  {
        int onelen = one.length();
        StringBuilder temp = new StringBuilder(two);
        for(int i = 0; i < onelen; i++) {
            int t = temp.toString().indexOf(one.charAt(i));
            if(t == -1) {
                return false;
            }   else    {
                temp.deleteCharAt(t);
            }
        }
        return true;
    }

    public boolean isPermutation(String one, String two) {
        int lone = one.length(), ltwo = two.length();
        for(int i = 0; i + lone <= ltwo; i++)    {
            String temp = two.substring(i, i + lone);
            if(isSubstring(one, temp)) {System.out.println(one + " " + temp); return true;}
        }
        return false;
    }

    public void tester () {
        String one = "hello";
        String two = "ooolleoooleh"; //eidbaooo";  //eidboaoo
        boolean temp = isPermutation(one, two);
        System.out.println(temp);
    }

}

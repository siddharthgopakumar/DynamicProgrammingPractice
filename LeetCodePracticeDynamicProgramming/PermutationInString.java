package LeetCodePracticeDynamicProgramming;

/**
 * Write a description of PermutationInString here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class PermutationInString {
    public boolean isSubstring(int[] tableOne, String two)  {
        int onelen = two.length();
        int[] tabletwo = new int[26];
        for(int i = 0; i < onelen; i++)   {
            tabletwo[two.charAt(i) - 97]  = (tabletwo[two.charAt(i) - 97] == 0)? 1:tabletwo[two.charAt(i) - 97]  + 1  ;
        }         
        for(int i = 0; i < 26; i++) {
            if(tableOne[i] != tabletwo[i])  return false;
        }
        return true;
    }

    public boolean isPermutation(String one, String two) {
        int lone = one.length(), ltwo = two.length();
        int[] tableOne = new int[26];
        for(int i = 0; i < lone; i++)   {
            tableOne[one.charAt(i) - 97]  = (tableOne[one.charAt(i) - 97] == 0)? 1:tableOne[one.charAt(i) - 97]  + 1  ;
        }   
        for(int i = 0; i + lone <= ltwo; i++)    {
            String temp = two.substring(i, i + lone);
            if(isSubstring(tableOne, temp))  return true;
        }
        return false;
    }

    public void tester () {
        String one = "hello";
        String two = "ooolleoooleh"; //eidbaooo";  //eidboaoo
        System.out.println(isPermutation(one, two));
        
        
        
        
    }

}

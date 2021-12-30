package LeetCodePracticeDynamicProgramming;

/**
 * Write a description of MaximumRate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */import java.util.Arrays;
public class DeleteAndEarn {
    public int maximiser (int[] arr) {       
        int l = arr.length;  
        Arrays.sort(arr);
        int table[] = new int[l + 1];
        int i = 0, j = 0, sum = 0, prev = 0, curr = 0, k = 2;
        table[0] = 0;
        while(j < l && arr[j] == arr[i])  {
                sum += arr[j];
                j++;
        }    
        table[1] = sum;
        prev = arr[0];
        i = j;    
        sum = 0;
        while(i < l)    {
            while(j < l && arr[j] == arr[i])  {
                sum += arr[j];
                j++;
            }
            curr = arr[i];
            if(prev == curr - 1)    {
                table[k] = Math.max(table[k - 2] + sum, table[k - 1]);
            }   else    {
                table[k] = Math.max(table[k - 1] + sum, table[k - 2]);
            }            
            prev = curr;
            i = j;  
            k++;
            sum = 0;
        }
        return table[k - 1];
    }

    public void tester () {
        System.out.println(maximiser(new int[] {2,2,3,3,3,4}));
    }

}

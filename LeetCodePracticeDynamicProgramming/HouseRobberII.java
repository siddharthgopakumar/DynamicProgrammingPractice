package LeetCodePracticeDynamicProgramming;

/**
 * Write a description of HouseRobberII here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HouseRobberII {
    public int rob(int[] nums) {
        int l = nums.length;
        int[] tableO = new int[l];
        int[] tableT = new int[l];
        tableO[0] = 0;
        tableO[1] = nums[0];
        for(int i = 2;i < l; i++)   {
            tableO[i] = Math.max(nums[i - 1] + tableO[i - 2], tableO[i - 1]);
        }
        tableT[0] = 0;
        tableT[1] = nums[1];
        for(int i = 2;i < l; i++)   {
            tableT[i] = Math.max(nums[i] + tableT[i - 2], tableT[i - 1]);
        }
        return (tableO[l - 1] > tableT[l - 1])?tableO[l - 1]:tableT[l - 1];   
    }

    public void tester () {
        System.out.println(rob(new int[] {1, 2, 3, 4, 5, 6}));
    }
}

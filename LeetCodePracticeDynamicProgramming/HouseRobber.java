
/**
 * Write a description of HouseRobber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HouseRobber {
    public int rob(int[] nums) {
        int l = nums.length;
        int table[] = new int[l + 1];
        table[0] = 0;
        table[1] = nums[0];
        for(int i = 2; i <= l; i++) {
            table[i] = Math.max(table[i - 2] + nums[i - 1], table[i - 1]);
        }
        return table[l];
    }
    
    public void tester () {
        System.out.println(rob(new int[] {1,2,3,1}));
    }

}

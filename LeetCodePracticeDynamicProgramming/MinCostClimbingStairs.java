
/**
 * Write a description of MinCostClimbingStairs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int l = cost.length;
        int[] table = new int[l + 1];
        table[0] = cost[0];
        table[1] = cost[1];
        for(int i = 2; i < l + 1; i++)  {
            if(i < l)   {
                table[i] = Math.min(cost[i] + table[i - 1], cost[i] + table[i - 2]);
            }   else    {
                table[i] = Math.min(table[i - 1], table[i -2]);
            }            
        }        
        return table[l];
    }
    
    public void tester () {
        System.out.println(minCostClimbingStairs(new int[] {1,100,1,1,1,100,1,1,100,1}));
    }
}



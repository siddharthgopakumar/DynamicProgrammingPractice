
/**
 * Write a description of CoinChange here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Arrays;
public class CoinChange {
    public int coinChange (int[] coins, int target) {
        int[] table = new int[target + 1];
        for(int i = 1; i < target + 1; i++) table[i] = -1;
        table[0] = 0;

        for(int i = 0; i < target + 1; i ++)   {
            for(int j = 0; j < coins.length; j++)   {
                if(table[i] != -1 && i + coins[j] < target + 1)  {
                    if(table[i + coins[j]] != -1) {
                        table[i + coins[j]] = Math.min(table[i] + 1, table[i + coins[j]]);
                        continue;
                    }
                    table[i + coins[j]] = table[i] + 1;
                }
                System.out.println(Arrays.toString(table));
            }
        }
        return table[target];
    }

    public void tester(){
        int[] coins = {2, 3, 6, 1};
        int target = 6;
        System.out.println(coinChange(coins, 10));
    }    

}

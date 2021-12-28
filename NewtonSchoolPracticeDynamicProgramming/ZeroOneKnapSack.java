
/**
 * Write a description of ZeroOneKnapSack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ZeroOneKnapSack {
    public int ZeroOneKnapSack  (int[] weights, int[] values, int n, int W)  {
        int[][] solTable = new int[n + 1][W + 1];
        for(int i = 0; i < n + 1; i++)  {
            for(int j = 0; j < W + 1; j++)  {
                if(i == 0 || j == 0)    {
                    solTable[i][j] = 0;
                    continue;
                }                
                if(j >= weights[i - 1])    {
                        solTable[i][j] = Math.max(values[i - 1], values[i - 1] + solTable[i - 1][j - weights[i - 1]]);
                }
                if(j < weights[i - 1])  {
                    solTable[i][j] = solTable[i - 1][j];
                }

            }

        }
        for(int i = 0; i < n + 1; i++)  {
            for(int j = 0; j < W + 1; j++)  {
                System.out.print(solTable[i][j] + "\t");
            }
            System.out.println();
        }
        return solTable[n][W];
    }
    public void tester () {
        ZeroOneKnapSack(new int[] {1, 2, 3}, new int[] {10, 15, 40}, 3, 7);
    }

        }

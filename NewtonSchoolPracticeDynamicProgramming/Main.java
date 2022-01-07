package NewtonSchoolPracticeDynamicProgramming;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class Main {
    public void subsetSum () {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int[][] arr = new int[m + 1][n + 1];
        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                arr[i][j] = scan.nextInt();
                if(j == n)  {
                    arr[i][j] = Math.max(arr[i - 1][j - 1], arr[i - 1][j]) + arr[i][j];
                }     else  {
                    arr[i][j] = Math.max(arr[i - 1][j], Math.max(arr[i - 1][j - 1], arr[i - 1][j + 1])) +  arr[i][j];
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for(int j = 1; j <= n; j++) {
            if(arr[m][j] > max) {
                max = arr[m][j];
            }
        }
        System.out.println(max);       
    }

    public void main () {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        while(T-- != 0) {
            subsetSum();
        }              // Your code here
    }
}
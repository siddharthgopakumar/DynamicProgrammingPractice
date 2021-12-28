
/**
 * Write a description of MatrixChainMultiplication here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MatrixChainMultiplication {
    static class  matrix {
        public int row;
        public int column;
        public matrix(int row, int column){
            this.row = row;
            this.column = column;
        }

        public static matrix matrixMultiplication(matrix one, matrix two) {
            matrix result = new matrix(one.row, two.column);
            return result;
        }

        public static  int matrixSteps(matrix one, matrix two) {
            return one.row * one.column * two.column;
        }

        public String toString(){
            return this.row + " " + this.column;
        }
    }
    public int lowestProduct(matrix[] matrices, int l, int r, int[][] table)  {
        if(l == r)  {
            return 0;
        }
        if(table[l][r] != 0)    return table[l][r];
        int min = Integer.MAX_VALUE;
        for(int i = l; i < r; i++)   {
            int left = lowestProduct(matrices, l, i, table);
            int right = lowestProduct(matrices, i + 1, r, table);
            int result = left + right + (matrices[l].row * matrices[i].column * matrices[r].column);
            if(result < min)   {
                min = result;
            }
        } 
        table[l][r] = min;
        return min;
    }

    public void tester () {
        int[] input =  {40, 20, 30, 10, 30};
        int l = input.length;
        matrix[] matrices = new matrix[l - 1];
        for(int i = 0; i < l - 1; i++)  {
            matrices[i] = new matrix(input[i], input[i + 1]);
        }     
        int[][] table = new int[l + 1][l + 1];
        System.out.println(lowestProduct(matrices, 0 , 3, table));

    }
}


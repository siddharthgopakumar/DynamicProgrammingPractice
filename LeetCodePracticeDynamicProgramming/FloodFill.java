package LeetCodePracticeDynamicProgramming;

/**
 * Write a description of FloodFill here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FloodFill {
    static int i = 0;
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor, int original ) {
        if(original == newColor)    return image;
        if(image[sr][sc] == original)   image[sr][sc] = newColor;        
        else return image;        
        if(sr - 1 >= 0)               floodFill(image, sr - 1, sc, newColor, original);
        if(sr + 1 < image.length)     floodFill(image, sr + 1, sc, newColor, original);
        if(sc - 1 >= 0)               floodFill(image, sr, sc - 1, newColor, original);
        if(sc + 1 < image[0].length)  floodFill(image, sr, sc + 1, newColor, original);        
        
        return image; 
    }

    public void tester () {
        int[][] image = {{0,0,0},{0,1,1}};
        for(int i = 0; i < image.length; i++)  {
            for(int j = 0; j < image[0].length ; j++)  {
                System.out.print(image[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println(image[1][1]);
        floodFill(image, 1, 1, 1, 1);
        for(int i = 0; i < image.length; i++)  {
            for(int j = 0; j < image[0].length ; j++)  {
                System.out.print(image[i][j] + "\t");
            }
            System.out.println();
        }
    }
}


/**
 * Write a description of tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringJoinUsage {
    public void tester () {
        String[] array = { "cat", "mouse" };
        String delimiter = " ";
        String result = String.join(delimiter, array);
        System.out.println(result);
    }

}

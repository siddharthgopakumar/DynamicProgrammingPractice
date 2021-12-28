package UnderstandingTheBasicStuff;

/**
 * Write a description of FibonacciUsingRecursion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FibonacciUsingMemorization {
    static long[] arr = new long[51];
    public long fibonacci(int n) {
        if(arr[n] != 0) {
            return arr[n];
        } 
        if(n <= 2)  {
            return 1l;
        }
        arr[n] = fibonacci(n - 1) + fibonacci(n - 2);
        return arr[n];
    }

    public void tester(){
        System.out.println(fibonacci(6));
        System.out.println(fibonacci(7));
        System.out.println(fibonacci(8));
        System.out.println(fibonacci(50));
    }

}

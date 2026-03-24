package fundamentals.Day4;

public class FibonacciNumber {

    public int fib(int n) {

        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);

    }

}

package fundamentals.Day4;

public class Factorial {

    int factorial(int n) {
        // code here
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;

    }

}

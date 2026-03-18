package fundamentals.Day3;

public class CheckPrime {

    static boolean isPrime(int n) {

        int c = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        if (c == 2) {
            return true;
        }

        return false;

    }

}

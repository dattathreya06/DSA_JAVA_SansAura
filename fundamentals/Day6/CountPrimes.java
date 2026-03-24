package fundamentals.Day6;

public class CountPrimes {

    public static boolean isPrime(int num) {

        if (num == 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int countPrimes(int n) {
        int c = 0;
        boolean isPrime = false;
        for (int i = 1; i < n; i++) {
            if (isPrime(i)) {
                c++;
            }
        }
        return c;

    }

}

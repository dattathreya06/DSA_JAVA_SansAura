package fundamentals.Day6;

import java.util.ArrayList;

public class PrimeFactors {

    public static boolean isPrime(int num) {

        for (int i = 0; i * i < num; i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Integer> primeFac(int n) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (isPrime(i)) {
                result.add(i);
            }
            n = n / i;

        }
        return result;
    }

}

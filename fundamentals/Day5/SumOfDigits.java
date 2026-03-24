package fundamentals.Day5;

public class SumOfDigits {

    static int sumOfDigits(int n) {

        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n = n / 10;

        }
        return sum;

    }

}

package fundamentals.Day3;

public class Armstrong {

    static boolean armstrongNumber(int n) {
        int org = n;

        int sum = 0;

        while (n != 0) {
            int r = n % 10;
            sum += (r * r * r);
            n = n / 10;

        }
        if (org == sum) {
            return true;
        }
        return false;

    }
}


public class ReverseNumber {

    public int reverseDigits(int n) {
        int rev = 0;
        while (n != 0) {
            int r = n % 10;

            if (r > 0) {
                rev = rev * 10 + r;
            }
            n = n / 10;

        }
        return rev;

    }

}

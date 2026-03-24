package fundamentals.Day5;

public class TrailingZeroes {

    public int trailingZeroes(int n) {

        int c = 0;

        while (n >= 0) {
            n = n / 5;
            c += n;
        }
        return c;

    }

}

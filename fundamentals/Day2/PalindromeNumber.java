
public class PalindromeNumber {

    public boolean isPalindrome(int n) {
        int org = n;
        int res = 0;

        while (n != 0) {

            int r = n % 10;
            res = res * 10 + r;
            n = n / 10;

        }
        if (res == org) {
            return true;
        }
        return false;

    }

}

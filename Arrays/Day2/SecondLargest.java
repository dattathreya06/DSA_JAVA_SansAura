package Arrays.Day2;

public class SecondLargest {

    public int getSecondLargest(int[] a) {

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                second = largest;
                largest = a[i];
            } else if (a[i] != largest && a[i] > second) {
                second = a[i];

            }
        }
        if (second == Integer.MIN_VALUE) {
            return -1;
        }
        return second;
    }

}

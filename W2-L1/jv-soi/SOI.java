public class SOI {
    public int sumOfIntegers(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumOfIntegers(n - 1);
        }
    }
}
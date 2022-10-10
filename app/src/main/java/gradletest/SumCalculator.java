package gradletest;

public class SumCalculator {
    public int sum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        if (sum != 0) {
            return sum;
        } else {
            throw new IllegalArgumentException("Invalid input data");
        }
    }
}

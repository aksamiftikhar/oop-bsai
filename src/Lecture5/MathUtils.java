package Lecture5;

public class MathUtils {
    final static double PI = 3.14159;
    // A private constructor to ensure that this class cannot be instantiated
    private MathUtils() {
    }


    // Static method to calculate factorial
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    // Static method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }




}
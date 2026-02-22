public class FibonacciRecursion {

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // base cases
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 6;

        int result = fibonacci(n);
        System.out.println("Fibonacci of " + n + " is " + result);
    }
}
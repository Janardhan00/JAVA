package Module0;
public class RecursionExample {
    // Recursive function to calculate factorial
    public static int factorial(int n) {
        if (n == 0) return 1; // Base case
        return n * factorial(n - 1); // Recursive call
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of " + num + " is: " + factorial(num));
    }
}

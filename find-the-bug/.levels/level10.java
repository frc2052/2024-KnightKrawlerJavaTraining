import java.util.Scanner;

// this is a prime number checker
public class level10 {
    public static void main(String...args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();
        
        boolean isPrime = checkPrime(n);
        
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }

    public static boolean checkPrime(int n) {
        if (n <= 1) {
            return true;
        }
        
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
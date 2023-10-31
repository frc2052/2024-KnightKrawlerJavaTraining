// this is a digit sum calculator

public class level11 {
    public static void main(String...args) {
        int num = 12345;
        int sum = calculateDigitSum(num);
        System.out.println("The sum of digits in " + num + " is: " + sum);
    }

    public static int calculateDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}

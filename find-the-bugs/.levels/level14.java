// this class checks if a string is a palindrome

public class level14 {
    public static void main(String[] args) {
        String input = "racecar";
        boolean isPalindrome = checkPalindrome(input);
        System.out.println("Is it a palindrome? " + isPalindrome);
    }

    public static boolean checkPalindrome(String input) {
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - i)) {
                return false;
            }
        }
        return true;
    }
}

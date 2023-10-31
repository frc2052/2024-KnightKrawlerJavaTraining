// this class checks if a string is a palindrome

public class level14 {
    public static void main(String[] args) {
        String input = "tacocat";
        boolean isPalindrome = checkPalindrome(input);
        System.out.println("Is it a palindrome? " + isPalindrome);
    }

    public static boolean checkPalindrome(String input) {
        for (int i = 1; i <= input.length() / 2; i++) {
            if (input.charAt(i-1) != input.charAt(input.length() - i)) {
                System.out.println(input.charAt(i-1)+" "+input.charAt(input.length()-1));

                return false;
            }
        }
        return true;
    }
}

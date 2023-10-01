// this is a string reverser

public class level12 {
    public static void main(String...args) {
        String input = "Hello, World!";
        String reversed = reverseString(input);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverseString(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }
}

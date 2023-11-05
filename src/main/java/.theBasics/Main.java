import java.util.Scanner;

public class Main {
    // Variable to store our instanced class for receiving input
    // NOTE: notice this variable has yet to be set equal to anything, this is done on line 13
    private static Scanner input;
    // Variable to store the users name once they provide it
    private static String name;

    // This method is the singular starting point of our application
    public static void main(String[] args) throws Exception {
        // ASSIGNMENT A:
        System.out.println("Hello world!");
        // ASSIGNMENT B:
        input = new Scanner(System.in);
        System.out.println("Please enter your name below:");
        name = input.nextLine();
        System.out.println("Welcome," + name + "!");
        // ASSIGNMENT C:
    }
}
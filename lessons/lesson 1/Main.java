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
        // Here we "initialize" or set our variable (input) equal to a new Scanner instance that receives input from 'System.in'
        input = new Scanner(System.in);

        // Asks the user to input their name through the console
        System.out.println("Please enter your name below:");
        
        // Gets the next available user input and sets the name variable to that input
        name = input.nextLine();

        // Prints a customized welcome message for the user
        System.out.println("Welcome, " + name + "!");
    }
}
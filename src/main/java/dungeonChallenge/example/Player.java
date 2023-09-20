import java.util.Scanner;

public class Player {
    private final Scanner input;

    private final String name;

    private Action desiredAction;
    private Direction desiredDirection;

    private int currentRoom;
    private boolean moved = true;

    private boolean isDead = false;
    private boolean hasWon = false;

    public Player(Scanner input, String name) {
        this.input = input;
        this.name = name;
    }

    public String getUserInput() {
        // Take the users input, convert it to lower case, and remove any blank spaces
        return input.nextLine().toLowerCase().trim();
    }

    public static void doSomething() {
        
    }

    public void processUserInput() {
        moved = false;

        desiredAction = Action.MOVE;

        // Ask the user for their input
        System.out.print("What's your move " + name + "? ");

        while (true) {            
            // Look through our list of valid inputs and check if one of them equals our input value
            switch (getUserInput()) {
                case "p":
                    desiredAction = Action.PEEK;

                    System.out.print("What direction would you like to peek? ");
                    break;

                case "n":
                    desiredDirection = Direction.NORTH;
                    return;

                case "s":
                    desiredDirection = Direction.SOUTH;
                    return;

                case "e":
                    desiredDirection = Direction.EAST;
                    return;

                case "w":
                    desiredDirection = Direction.WEST;
                    return;
            
                case "h":
                    printHelpMenu();
                    break;

                default:
                    invalidInput();
                    break;
            }
        }
    }

    public Action getDesiredAction() {
        return desiredAction;
    }

    public Direction getDesiredDirection() {
        return desiredDirection;
    }

    public int getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(int room) {
        if (currentRoom != room) {
            moved = true;
            currentRoom = room;
        }
    }

    public boolean hasMoved() {
        return moved;
    }

    public boolean isDead() {
        return isDead;
    }

    public void killPlayer() {
        isDead = true;
    }

    public boolean hasWon() {
        return hasWon;
    }

    public void playerWon() {
        hasWon = true;
    }

    private void invalidInput() {
        System.out.println("Invalid input, type 'h' for a list of valid inputs.");
    }

    private void printHelpMenu() {
        System.out.println("Enter a command letter and press enter/return.");
        System.out.println("Available command letters are:");
        System.out.println("   'n' to move north");
        System.out.println("   's' to move south");
        System.out.println("   'e' to move east");
        System.out.println("   'w' to move west");
        System.out.println("   'p' to peek at your current surroundings.");
        System.out.println("   'x' to exit");
    }
}
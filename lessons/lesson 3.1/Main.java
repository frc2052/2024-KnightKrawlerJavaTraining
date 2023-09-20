import java.util.Scanner;

public class Main {
    // Variable to store our instanced class for receiving input
    // NOTE: notice this variable has yet to be set equal to anything, this is done on line 13
    private final Scanner input;
    // Variable to store the users name once they provide it
    private final String name;
    
    private final Dungeon dungeon;
    // Variable to represent our player, gets input, stores a name, etc.
    private final Player player;

    private Main() {
        // ASSIGNMENT A:
        System.out.println("Hello world!");

        // ASSIGNMENT B:
        // Here we "initialize" or set our variable (input) equal to a new Scanner instance that receives input from 'System.in'
        input = new Scanner(System.in);

        // Asks the user to input their name through the console
        System.out.print("Please enter your name: ");

        // Gets the next available user input and sets the name variable to that input
        name = input.nextLine();

        // Prints a customized welcome message for the user
        System.out.println("Welcome, " + name + "!");

        // Initialize our dungeon instance to the dungeon variable
        dungeon = new Dungeon();
        // Initialize our player instwance to the player variable
        player = new Player(input, name);

        // Game loop
        while(!player.isDead() && !player.hasWon()) {
            if (player.hasMoved()) {
                System.out.println(dungeon.getRoom(player.getCurrentRoom()).getDescription());
            }

            player.processUserInput();

            int desiredRoom = dungeon.getNextRoom(player.getDesiredDirection(), player.getCurrentRoom());
            
            if (desiredRoom != -1) {
                player.setCurrentRoom(desiredRoom);

                if (dungeon.getRoom(desiredRoom).isDeathRoom()) {
                    player.killPlayer();
                }
        
                if (dungeon.getRoom(desiredRoom).isWinningRoom()) {
                    player.playerWon();
                }
            } else {
                System.out.println("You ran into a wall!");
            }
        }
    }

    // This method is the singular starting point of our application
    public static void main(String[] args) throws Exception {
        // Create a new instance of this class to run the constructor above
        // No need to save this to a variable because we won't need to access it once it's running
        new Main();
    }
}

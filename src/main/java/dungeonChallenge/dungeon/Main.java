package main.java.dungeonChallenge.dungeon;

import java.util.Scanner;

public class Main {
    // Variable to store our instanced class for receiving input
    // NOTE: notice this variable has yet to be set equal to anything, this is done on line 13
    private Scanner input;

    private String inputValue;

    // Variable to store the users name once they provide it
    public String name;        
    
    private Boolean isDead = false;
    private Boolean hasWon = false;
    private int currentPosition = 0; 

    private final Dungeon dungeon;
    private final Player player;



    
    public Main() {
        // Here we "initialize" or set our variable (input) equal to a new Scanner instance that receives input from 'System.in'
        input = new Scanner(System.in);

        // Asks the user to input their name through the console
        System.out.println("Please enter your name below:");
        
        // Gets the next available user input and sets the name variable to that input
        name = input.nextLine();

        // Prints a customized welcome message for the user
        System.out.println("Welcome, " + name + "!");

        //Makes dungeon and player
        dungeon = new Dungeon();
        player = new Player(input, name);

        // Game Loop
        while (!player.isDead() && !player.hasWon) {
            player.processUserInput();

            int desiredRoom = dungeon.getNextRoom(player.getDesiredDirection(), player.getCurrentRoom());

            if (desiredRoom == -1) {
                System.out.println("you ran into a wall");
                break;
            } else {
                player.setCurrentRoom(desiredRoom);
            }
            }

        if (player.hasWon) {
            System.out.println("you won!");
        } else {
            System.out.println("you lose!");
        }
        }

    // This method is the singular starting point of our application
    public static void main(String[] args) throws Exception {
        new Main();
    }

    public static void printDeath() {
        System.out.println("You unlock the door and slowly push the door open.");
        System.out.println("As you enter the room a small candle on the table catches your attention.");
        System.out.println("As you are mesmerized by the flame, you fail to notice the witch who casts a spell to turn you to stone.");
        System.out.println("You will forever adorn her room. You have died.");
    }
}
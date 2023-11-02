package main.java.dungeonChallenge.dungeon;

import java.util.Scanner;

public class Main {
    enum Direction {
        NORTH,
        EAST,
        SOUTH,
        WEST
    }
    // Variable to store our instanced class for receiving input
    // NOTE: notice this variable has yet to be set equal to anything, this is done on line 13
    private Scanner input;

    private String inputValue;

    // Variable to store the users name once they provide it
    public String name;        
    
    private Boolean isDead = false;
    private Boolean hasWon = false;
    private int currentPosition = 0; 



    
    public Main() {
        // Here we "initialize" or set our variable (input) equal to a new Scanner instance that receives input from 'System.in'
        input = new Scanner(System.in);

        // Asks the user to input their name through the console
        System.out.println("Please enter your name below:");
        
        // Gets the next available user input and sets the name variable to that input
        name = input.nextLine();

        // Prints a customized welcome message for the user
        System.out.println("Welcome, " + name + "!");

        final Player player = new Player(input, name);

        // Game Loop
        while (!player.isDead() && !player.hasWon) {
            switch (currentPosition) {
                inputValue = input.nextLine();
                inputValueTrimmed = inputValue.toLowerCase().trim();
                case 0:
                    System.out.println("You are at the entrance, you can only go north. Type \"N\" to go north.");
                    inputValue = input.nextLine();
                    if (inputValueTrimmed.equals("n")) {
                        currentPosition = 1;
                    } else {
                        System.out.println("Invalid direction. Only \"N\" is valid");
                    }
                        break;
                case 1:
                    System.out.println("You are standing at a hallway intersection that moves in all four directions; north, south, east and west.");
                    inputValue = input.nextLine();
                    if (inputValue.toLowerCase().trim().equals("e")) {
                        currentPosition = 2;
                    } else if (inputValue.toLowerCase().trim().equals("n")) {
                        currentPosition = 3;
                    } else if (inputValue.toLowerCase().trim().equals("w")) {
                        currentPosition = 4;
                    } else if (inputValue.toLowerCase().trim().equals("s")) {
                        currentPosition = 0;
                    } else {
                        System.out.println("Invalid direction. Only \"N\", \"S\", \"E\", \"W\",  are valid");
                    }
                    break;
                case 2:
                    System.out.println("You have found a large wooden door that is latched from the outside. Do you enter \"E\" or Go Back \"B\"");
                    inputValue = input.nextLine();
                    if (inputValue.toLowerCase().trim().equals("e")) {
                        System.out.println("You unlock the door and slowly push the door open.");
                        System.out.println("As you enter the room a small candle on the table catches your attention.");
                        System.out.println("As you are mesmerized by the flame, you fail to notice the witch who casts a spell to turn you to stone.");
                        System.out.println("You will forever adorn her room. You have died.");
                        
                        isDead = true;
                    } else if (inputValue.toLowerCase().trim().equals("b")) {
                        currentPosition = 2;
                    } else {
                        System.out.println("Invalid direction. Only \"E\" and \"B\" are valid");
                    }
                    break;
                case -1:
                    System.out.println("you ran into a wall");
                    break;
            }
        }
    }

    // This method is the singular starting point of our application
    public static void main(String[] args) throws Exception {
        new Main();
    }
}
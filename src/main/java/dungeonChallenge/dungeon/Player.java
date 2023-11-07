package main.java.dungeonChallenge.dungeon;

public class Player {
    private Scanner input;
    String name;
    String desiredDirection;
    int currentRoom;
    Boolean moved = true;
    Boolean isDead = false;
    Boolean hasWon = false;

    public Player(Scanner input, String name) {
        this.input = input;
        this.name = name;
    }


    public String getUserInput() {
        // Take the users input, convert it to lower case, and remove any blank spaces
        return input.nextLine().toLowerCase().trim();
    }
    
    public void processUserInput() {
        moved = false;
    
        // Ask the user for their input
        System.out.print("What's your move " + name + "? ");
    
        while (true) {            
            // Look through our list of valid inputs and check if one of them equals our input value
            switch (getUserInput()) {
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
                    //printHelpMenu();
                    break;
    
                default:
                    //invalidInput();
                    break;
            }
        }
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

    public Boolean hasWon() {
        return hasWon;
    }

    public void setHasWon(Boolean hasWon) {
        this.hasWon = hasWon;
    }

    public Boolean isDead() {
        return isDead;
    }

    public void setIsDead(Boolean isDead) {
        this.isDead = isDead;
    }
    
    public Boolean moved() {
        return moved;
    }

    private void printHelpMenu() {
        System.out.println("help menu");
    }

    private void invalidInput() {
        System.out.println("invalid input");
    }


}

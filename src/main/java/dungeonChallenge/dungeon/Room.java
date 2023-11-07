package main.java.dungeonChallenge.dungeon;

public class Room {
    //north south east west
    public final String description;
    public final int northRoom;
    public final int southRoom;
    public final int eastRoom;
    public final int westRoom;
    public final boolean isDieRoom;
    public final boolean isWinRoom;

    public Room(String description, int northRoom, int southRoom, int eastRoom, int westRoom, boolean isDieRoom, boolean isWinRoom) {
        this.description = description;
        this.northRoom = northRoom;
        this.southRoom = southRoom;
        this.eastRoom = eastRoom;
        this.westRoom = westRoom;
        this.isDieRoom = isDieRoom;
        this.isWinRoom = isWinRoom;
    }

    public int getConnectedRoom(Direction roomDirection) {
        switch (roomDirection) {
            case NORTH: 
                return northRoom;
            case SOUTH: 
                return southRoom;
            case EAST: 
                return eastRoom;
            case WEST: 
                return westRoom;
        }
        return -1;
    }
}

package main.java.dungeonChallenge.dungeon;

public class Room {
    //north south east west
    public final int northRoom;
    public final int southRoom;
    public final int eastRoom;
    public final int westRoom;

    public Room(int northRoom, int southRoom, int eastRoom, int westRoom) {
        this.northRoom = northRoom;
        this.southRoom = southRoom;
        this.eastRoom = eastRoom;
        this.westRoom = westRoom;
    }

    public int getConnectedRoom(Direction roomDirection) {
        switch (roomDirection) {
            case NORTH: return northRoom;
            case SOUTH: return southRoom;
            case EAST: return eastRoom;
            case WEST: return westRoom;
        }
    }
}

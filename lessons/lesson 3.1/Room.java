public class Room {
    private boolean visited = false;

    private final String description;

    public final int northConnectedRoom;
    public final int southConnectedRoom;
    public final int eastConnectedRoom;
    public final int westConnectedRoom;

    private final boolean isDeathRoom;
    private final boolean isWinningRoom;

    public Room( 
        String description,
        int northConnectedRoom,
        int southConnectedRoom,
        int eastConnectedRoom,
        int westConnectedRoom,
        boolean isDeathRoom,
        boolean isWinningRoom
    ) {
        this.description = description;

        this.northConnectedRoom = northConnectedRoom;
        this.southConnectedRoom = southConnectedRoom;
        this.eastConnectedRoom = eastConnectedRoom;
        this.westConnectedRoom = westConnectedRoom;

        this.isDeathRoom = isDeathRoom;
        this.isWinningRoom = isWinningRoom;
    }

    public String getDescription() {
        String modifiedDescription;

        if (visited) {
            modifiedDescription = "you re-enter " + description;
        } else {
            modifiedDescription = "you enter " + description;
        }

        return modifiedDescription;
    }

    public int getConnectingRoom(Direction direction) {
        switch (direction) {
            case NORTH:
                return northConnectedRoom;
        
            case SOUTH:
                return southConnectedRoom;

            case EAST:
                return eastConnectedRoom;

            case WEST:
                return westConnectedRoom;

            default:
                return -1;
        }
    }

    public boolean isDeathRoom() {
        return isDeathRoom;
    }

    public boolean isWinningRoom() {
        return isWinningRoom;
    }
}

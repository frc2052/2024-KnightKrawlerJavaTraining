public class Dungeon {
    private final Room[] dungeon = {
        new Room(
            "Room 0", 
            1, 
            -1, 
            -1, 
            -1,
            false,
            false
        ),
        new Room(
            "Room 1", 
            2, 
            0, 
            3, 
            -1,
            false,
            false
        ),
        new Room(
            "You escape the dungeon! Huray!", 
            -1, 
            1, 
            -1, 
            -1,
            false,
            true
        ),
        new Room(
            "A viscous beast rips you to shreds!", 
            -1, 
            -1, 
            -1, 
            -1,
            true,
            false
        )
    };

    public Room getRoom(int room) {
        return dungeon[room];
    }

    public int getNextRoom(Direction desiredDirection, int currentRoom) {
        return dungeon[currentRoom].getConnectingRoom(desiredDirection);
    }
}
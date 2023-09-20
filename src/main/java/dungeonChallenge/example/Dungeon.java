public class Dungeon {
    private final Room[] dungeon = {
        new Room(
            "Room 0", 
            "Peeking at Room 0", 
            1, 
            -1, 
            -1, 
            -1,
            false,
            false
        ),
        new Room(
            "Room 1", 
            "Peeking at Room 1", 
            2, 
            0, 
            3, 
            -1,
            false,
            false
        ),
        new Room(
            "You escape the dungeon! Huray!", 
            "A room with door at the far end, there appears to be sunlight coming through the cracks of the door...", 
            -1, 
            1, 
            -1, 
            -1,
            false,
            true
        ),
        new Room(
            "A viscous beast rips you to shreds!", 
            "You peer into a misty room... \ntwo glowing red eyes stair deep into your soul.", 
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
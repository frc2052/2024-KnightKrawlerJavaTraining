package main.java.dungeonChallenge.dungeon;

public class Dungeon {
    private final Room[] dungeon = {
        new Room(
            "Room 0",
            1,
            0,
            0,
            0,
            false,
            false
        ),
        new Room(
            "Room 1",
            2,
            0,
            0,
            0,
            false,
            false
        ),
        new Room(
            "Room 2",
            -1,
            -1,
            -1,
            -1,
            false,
            true
        )
    };

    public Room getRoom(int room) {
        return dungeon[room];
    }

    public int getNextRoom(Direction desiredDirection, int currentRoom) {
        System.out.println("dungeon[currentRoom]: "+dungeon[currentRoom]);
        return dungeon[currentRoom].getConnectedRoom(desiredDirection);
    }

    
}

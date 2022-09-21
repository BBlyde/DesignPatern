package maze.door;

import maze.room.Room;

public class MagicDoor extends Door{

    public MagicDoor(Room room1, Room room2, boolean isOpen) {
		super(room1, room2, isOpen);
	}

	public MagicDoor(Room room1, Room room2) {
		super(room1, room2, true);
	}

    public String toString() {
		return "magic door[" + getRoom1().getNumber() + "-" + getRoom2().getNumber() +"]";
	}

}

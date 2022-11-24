package td1cor.factory;

import td1cor.maze.door.Door;
import td1cor.maze.door.MagicDoor;
import td1cor.maze.room.EnchantedRoom;
import td1cor.maze.room.Room;

public class EnchantedMazeFactory extends MazeFactory {

	@Override
	public Room makeRoom(int number) {
		return new EnchantedRoom(number);
	}

	@Override
	public Door makeDoor(Room room1, Room room2) {
		return new MagicDoor(room1, room2);
	}

}

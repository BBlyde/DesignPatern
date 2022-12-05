package test.maze.factory;

import test.maze.door.Door;
import test.maze.door.MagicDoor;
import test.maze.room.EnchantedRoom;
import test.maze.room.Room;

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

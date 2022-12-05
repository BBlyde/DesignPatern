package test.maze.factory;

import test.maze.Maze;
import test.maze.door.Door;
import test.maze.room.Room;
import test.maze.wall.Wall;

public class MazeFactory {

	public Maze makeMaze() {
		return new Maze();
	}

	public Room makeRoom(int number) {
		return new Room(number);
	}

	public Wall makeWall() {
		return new Wall();
	}

	public Door makeDoor(Room room1, Room room2) {
		return new Door(room1, room2);
	}

}

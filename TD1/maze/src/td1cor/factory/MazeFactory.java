package td1cor.factory;

import td1cor.maze.Maze;
import td1cor.maze.door.Door;
import td1cor.maze.room.Room;
import td1cor.maze.wall.Wall;

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

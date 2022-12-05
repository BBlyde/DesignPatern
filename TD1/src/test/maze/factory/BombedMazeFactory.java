package test.maze.factory;

import test.maze.room.Room;
import test.maze.room.RoomWithABomb;
import test.maze.wall.BombedWall;
import test.maze.wall.Wall;

public class BombedMazeFactory extends MazeFactory {
	
	@Override
	public Room makeRoom(int number) { 
		return new RoomWithABomb(number);
	}
	
	@Override
	public Wall makeWall() { 
		return new BombedWall();
	}
	
}

package td1cor.factory;

import td1cor.maze.room.Room;
import td1cor.maze.room.RoomWithABomb;
import td1cor.maze.wall.BombedWall;
import td1cor.maze.wall.Wall;

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
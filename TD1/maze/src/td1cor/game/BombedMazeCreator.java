package td1cor.game;

import td1cor.maze.room.Room;
import td1cor.maze.room.RoomWithABomb;
import td1cor.maze.wall.BombedWall;
import td1cor.maze.wall.Wall;

public class BombedMazeCreator extends MazeGameCreator {

	public Room makeRoom(int number) { 
		return new RoomWithABomb(number);
	}
	
	public Wall makeWall() { 
		return new BombedWall();
	}
	
}

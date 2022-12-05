package test.maze.game;

import test.maze.room.Room;
import test.maze.room.RoomWithABomb;
import test.maze.wall.BombedWall;
import test.maze.wall.Wall;

public class BombedMazeCreator extends MazeGameCreator {

	public Room makeRoom(int number) { 
		return new RoomWithABomb(number);
	}
	
	public Wall makeWall() { 
		return new BombedWall();
	}
	
}

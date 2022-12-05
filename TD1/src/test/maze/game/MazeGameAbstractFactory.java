package test.maze.game;

import test.maze.Maze;
import test.maze.door.Door;
import test.maze.factory.BombedMazeFactory;
import test.maze.factory.EnchantedMazeFactory;
import test.maze.factory.MazeFactory;
import test.maze.room.Room;
import test.maze.room.Room.Direction;

public class MazeGameAbstractFactory {

	public static Maze create(MazeFactory factory) {
		Maze maze = factory.makeMaze();
		Room room1 = factory.makeRoom(1);
		Room room2 = factory.makeRoom(2);
		Door door = factory.makeDoor(room1, room2);

		maze.addRoom(room1);
		room1.setSide(Direction.NORTH, factory.makeWall());
		room1.setSide(Direction.EAST, door);
		room1.setSide(Direction.SOUTH, factory.makeWall());
		room1.setSide(Direction.WEST, factory.makeWall());

		maze.addRoom(room2);
		room2.setSide(Direction.NORTH, factory.makeWall());
		room2.setSide(Direction.EAST, factory.makeWall());
		room2.setSide(Direction.SOUTH, factory.makeWall());
		room2.setSide(Direction.WEST, door);

		return maze;
	}

	public static void main(String[] args) {
		System.out.println("Simple maze using a factory");
		System.out.println(create(new MazeFactory()));
		System.out.println("Enchated maze using a factory");
		System.out.println(create(new EnchantedMazeFactory()));
		System.out.println("Bombed maze using a factory");
		System.out.println(create(new BombedMazeFactory()));
	}
}

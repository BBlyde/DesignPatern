package test.maze.game;

import test.maze.Maze;
import test.maze.door.Door;
import test.maze.door.MagicDoor;
import test.maze.room.EnchantedRoom;
import test.maze.room.Room;
import test.maze.room.RoomWithABomb;
import test.maze.room.Room.Direction;
import test.maze.wall.BombedWall;
import test.maze.wall.Wall;

public class SimpleMazeGame {

	public Maze createMaze() {
		Maze maze = new Maze();
		Room room1 = new Room(1);
		Room room2 = new Room(2);
		Door door = new Door(room1, room2);

		maze.addRoom(room1);
		room1.setSide(Direction.NORTH, new Wall());
		room1.setSide(Direction.EAST, door);
		room1.setSide(Direction.SOUTH, new Wall());
		room1.setSide(Direction.WEST, new Wall());

		maze.addRoom(room2);
		room2.setSide(Direction.NORTH, new Wall());
		room2.setSide(Direction.EAST, new Wall());
		room2.setSide(Direction.SOUTH, new Wall());
		room2.setSide(Direction.WEST, door);

		return maze;
	}

	public Maze createMaze(String type) {
		if (type.equals("enchanted")) {
			return createEnchantedMaze();
		} else if (type.equals("enchanted")) {
			return createBombedMaze();
		} else {
			return createMaze();
		}
	}

	public Maze createEnchantedMaze() {
		Maze maze = new Maze();
		Room room1 = new EnchantedRoom(1);
		Room room2 = new EnchantedRoom(2);
		Door door = new MagicDoor(room1, room2);

		maze.addRoom(room1);
		room1.setSide(Direction.NORTH, new Wall());
		room1.setSide(Direction.EAST, door);
		room1.setSide(Direction.SOUTH, new Wall());
		room1.setSide(Direction.WEST, new Wall());

		maze.addRoom(room2);
		room2.setSide(Direction.NORTH, new Wall());
		room2.setSide(Direction.EAST, new Wall());
		room2.setSide(Direction.SOUTH, new Wall());
		room2.setSide(Direction.WEST, door);

		return maze;
	}

	public Maze createBombedMaze() {
		Maze maze = new Maze();
		Room room1 = new RoomWithABomb(1);
		Room room2 = new RoomWithABomb(2);
		Door door = new Door(room1, room2);

		maze.addRoom(room1);
		room1.setSide(Direction.NORTH, new BombedWall());
		room1.setSide(Direction.EAST, door);
		room1.setSide(Direction.SOUTH, new BombedWall());
		room1.setSide(Direction.WEST, new BombedWall());

		maze.addRoom(room2);
		room2.setSide(Direction.NORTH, new BombedWall());
		room2.setSide(Direction.EAST, new BombedWall());
		room2.setSide(Direction.SOUTH, new BombedWall());
		room2.setSide(Direction.WEST, door);

		return maze;
	}

	public static void main(String[] args) {
		SimpleMazeGame game = new SimpleMazeGame();
		System.out.println(game.createMaze());
		System.out.println(game.createEnchantedMaze());
		System.out.println(game.createBombedMaze());
	}

}

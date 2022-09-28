package maze;

import maze.door.*;
import maze.room.*;
import maze.room.Room.Direction;
import maze.wall.*;

public class MagicMazeCreator extends SimpleMazeGame{

    public Maze createEnchantedMaze(){
        Maze maze1 = new Maze();

        EnchantedRoom room1 = new EnchantedRoom(1);
        EnchantedRoom room2 = new EnchantedRoom(2);

        Wall wall1 = new Wall();
        MagicDoor door1 = new MagicDoor(room1, room2);

        room1.setSide(Direction.NORTH, wall1);
        room1.setSide(Direction.WEST, wall1);
        room1.setSide(Direction.EAST, door1);
        room1.setSide(Direction.SOUTH, wall1);

        room2.setSide(Direction.NORTH, wall1);
        room2.setSide(Direction.WEST, door1);
        room2.setSide(Direction.EAST, wall1);
        room2.setSide(Direction.SOUTH, wall1);

        maze1.addRoom(room1);
        maze1.addRoom(room2);

        return maze1;
    }

}

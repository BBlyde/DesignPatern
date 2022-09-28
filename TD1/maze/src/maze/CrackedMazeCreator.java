package maze;

import maze.door.*;
import maze.room.*;
import maze.room.Room.Direction;
import maze.wall.*;

public class CrackedMazeCreator extends SimpleMazeGame{
    
    public Maze createCrackedMaze(){
        Maze maze1 = new Maze();

        MinedRoom room1 = new MinedRoom(1);
        MinedRoom room2 = new MinedRoom(2);

        Wall wall1 = new CrackedWall();
        Door door1 = new Door(room1, room2);

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

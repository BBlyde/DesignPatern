package td1cor.maze;

import java.util.ArrayList;
import java.util.List;

import maze.room.Room;

public class Maze {

	private List<Room> rooms;

	public Maze() {
		this.rooms = new ArrayList<Room>();
	}

	public void addRoom(td1cor.maze.room.Room room2) {
		this.rooms.add(room2);
	}

	public Room roomNo(int number) {
		for (Room room : rooms) {
			if (room.getNumber() == number) {
				return room;
			}
		}
		return null;
	}

	public String toString() {
		String str = "Maze with " + rooms.size() + " room"
				+ (rooms.size() > 1 ? "s" : "") + ":\n";
		for (Room room : rooms) {
			str += "- " + room + "\n";
		}
		return str;
	}

}

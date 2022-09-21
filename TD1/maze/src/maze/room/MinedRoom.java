package maze.room;

import java.util.Map;

import maze.MapSite;

public class MinedRoom extends Room {
    private Map<Direction, MapSite> mapsites;

	public MinedRoom(int number) {
		super(number);
	}

    public void enter() {
		System.out.println("I enter in the " + this.toString());
	}

    @Override
    public String toString(){
        String result = "mined room " + getNumber();
		for (Direction d : this.mapsites.keySet()) {
			if (this.mapsites.get(d) != null) {
				result += " " + d + ":";
				if (this.mapsites.get(d) instanceof Room) {
					result += "mined room " + ((Room) this.mapsites.get(d)).getNumber();
				} else {
					result += this.mapsites.get(d);
				}
			}
		}
		return result;
    }
}

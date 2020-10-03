package factories;

import model.AbstractDoor;
import model.AbstractMaze;
import model.AbstractRoom;
import model.AbstractWall;
import model.EnchantedDoor;
import model.EnchantedMaze;
import model.EnchantedRoom;
import model.EnchantedWall;

public class EnchantedMazeFactory extends AbstractMazeFactory {

	@Override
	public AbstractDoor makeDoor() {
		return new EnchantedDoor();
		
	}

	@Override
	public AbstractMaze makeMaze() {
		return new EnchantedMaze();
	}

	@Override
	public AbstractRoom makeRoom() {
		return new EnchantedRoom();
	}

	@Override
	public AbstractWall makeWall() {
		return new EnchantedWall();
	}
	
	

}

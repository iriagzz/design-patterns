package factories;

import model.AbstractDoor;
import model.AbstractMaze;
import model.AbstractRoom;
import model.AbstractWall;

public abstract class AbstractMazeFactory {

	public abstract AbstractDoor makeDoor();

	public abstract AbstractMaze makeMaze();

	public abstract AbstractRoom makeRoom();

	public abstract AbstractWall makeWall();
	
	

}

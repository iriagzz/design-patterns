package factories;

import model.AbstractDoor;
import model.AbstractMaze;
import model.AbstractRoom;
import model.AbstractWall;
import model.Door;
import model.Maze;
import model.Room;
import model.Wall;

public class MazeFactory extends AbstractMazeFactory {

	@Override
	public AbstractDoor makeDoor() {
		return new Door();
	}

	@Override
	public AbstractMaze makeMaze() {
		return new Maze();
	}

	@Override
	public AbstractRoom makeRoom() {
		return new Room();
	}

	@Override
	public AbstractWall makeWall() {
		return new Wall();
	}

}

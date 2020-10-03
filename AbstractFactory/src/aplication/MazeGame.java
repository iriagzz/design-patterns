package aplication;

import factories.AbstractMazeFactory;
import factories.EnchantedMazeFactory;
import factories.MazeFactory;
import model.AbstractDoor;
import model.AbstractMaze;
import model.AbstractRoom;
import model.AbstractWall;

public class MazeGame {

	private AbstractDoor door;
	private AbstractMaze maze;
	private AbstractRoom room;
	private AbstractWall wall;

	public MazeGame(AbstractMazeFactory factory) {
		door = factory.makeDoor();
		maze = factory.makeMaze();
		room = factory.makeRoom();
		wall = factory.makeWall();
	}

	public void create() {
		door.create();
		maze.create();
		room.create();
		wall.create();
	}

}

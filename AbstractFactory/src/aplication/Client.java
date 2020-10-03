package aplication;

import javax.swing.JOptionPane;

import factories.AbstractMazeFactory;
import factories.EnchantedMazeFactory;
import factories.MazeFactory;

public class Client {

	private static MazeGame createMaze(String type) {
        MazeGame game = null;
		AbstractMazeFactory factory = null;
        if (type.equalsIgnoreCase("enchanted")) {
            factory = new EnchantedMazeFactory();
            game = new MazeGame(factory);
        } else {
        	factory = new MazeFactory();
            game = new MazeGame(factory);
        }
        return game;
    }
	
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("For an Enchanted game, insert Enchanted. Any key for a default game.");
		MazeGame game = createMaze(input);
		game.create();

	}

}

package gui;

import javax.swing.*;

/**
 * This class is to house and handle the GUI of the game.
 * 
 * @author wades39
 * @version September 11, 2020
 */
public class GUI {
	
	/* -----| INSTANCE VARIABLES |----- */
	
	/**
	 * JFrame to be the GUI
	 */
	private JFrame guiFrame;
	/**
	 * JPanel to be the background of the game.
	 */
	private JPanel componentBackground;
	/**
	 * Will display the game field.
	 */
	private JLabel gameField;
	/**
	 * Will display the currently held piece.
	 */
	private JLabel hold;
	/**
	 * Will display the next piece to spawn.
	 */
	private JLabel next;
	/**
	 * Labels for the next and hold displays.
	 */
	private JLabel nextLbl, holdLbl;
	/**
	 * Displays the number of lines cleared.
	 */
	private JLabel linesCleared;
	/**
	 * Displays the player's score.
	 */
	private JLabel playerScore;
	/**
	 * Displays the game's current level of difficulty.
	 */
	private JLabel gameLevel;
	
	
	/* -----| CONSTRUCTOR |----- */
	
	/**
	 * Constructs the GUI.
	 */
	public GUI() {
		guiFrame = new JFrame("Tetris");
		guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// TODO:  Build GUI
		
		guiFrame.pack();
		guiFrame.setVisible(true);
	}

	public static void main(String[] args) {

	}

}

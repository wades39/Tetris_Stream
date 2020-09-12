package game_pieces;

import java.awt.Color;
import java.awt.Point;

/**
 * Abstract class for constructing game block objects.
 * 
 * @author wades39
 * @version September 11, 2020
 */
public class Block {

	/* -----| INSTANCE VARIABLES |----- */

	/**
	 * The X position of the block.
	 */
	private int xPos;
	/**
	 * The Y position of the block.
	 */
	private int yPos;
	/**
	 * The color of the block.
	 */
	private Color color;
	/**
	 * Indicates whether or not this block is placed.
	 */
	private boolean isPlaced;

	/* -----| CONSTRUCTOR |----- */

	/**
	 * Constructs a block
	 * 
	 * @param xPos  The X position of the block
	 * @param yPos  The Y position of the block
	 * @param color The color of the block.
	 */
	public Block(int xPos, int yPos, Color color) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.color = color;
	}

	/* -----| PUBLIC METHODS |----- */

	/**
	 * Moves the block by the provided values.
	 * 
	 * @param xChange The number of spaces to move the block in the X direction.
	 *                Negative means left, positive means right.
	 * @param yChange The number of spaces to move the block in the Y direction. The
	 *                block can only move down, so negative values are illegal.
	 */
	public void moveBlock(int xChange, int yChange) {
		xPos += xChange;
		yPos += yChange;
	}
	
	/**
	 * Places this block.
	 */
	public void place() {
		this.isPlaced = true;
	}

	/**
	 * Indicates whether or not this block is on the given row.
	 * 
	 * @param rowPos The Y coordinate of the row.
	 * @return True if this block is on the row, otherwise returns false.
	 */
	public boolean isOnRow(int rowPos) {
		if (this.yPos == rowPos) {
			return true;
		}
		return false;
	}

	/**
	 * Returns the position of the block as a point.
	 * 
	 * @return The position of the block as a point.
	 */
	public Point getPosition() {
		return new Point(xPos, yPos);
	}

	/**
	 * Returns the color of this block.
	 * 
	 * @return The color of this block.
	 */
	public Color getColor() {
		return this.color;
	}

}

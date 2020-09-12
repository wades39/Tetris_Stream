package game_pieces;

import java.awt.Point;
import java.util.HashSet;

/**
 * This object is a representation of the square game piece.
 * @author wades39
 * @version September 11, 2020
 *
 */
public class SquarePiece {

	/**
	 * The position of the center of the piece.
	 */
	private Point centerPos;
	/**
	 * Houses all of the blocks that make up this piece.
	 */
	private HashSet<Block> blocks;
	
	/**
	 * Constructs the piece.
	 * @param centerPos
	 */
	public SquarePiece(Point centerPos) {
		this.centerPos = centerPos;
		
	}

}

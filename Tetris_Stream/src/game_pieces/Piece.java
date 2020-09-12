package game_pieces;

import java.util.HashSet;

/**
 * This indicates the outline of methods that need to be included within every
 * game piece class.
 * 
 * @author wades39
 * @version September 11, 2020
 */
public abstract class Piece {

	/**
	 * Moves the piece by the indicated amount.
	 * 
	 * @param xChange
	 * @param yChange
	 */
	abstract void movePiece(int xChange, int yChange);

	/**
	 * Rotates the piece in the indicated direction. Negative is left, positive is
	 * right.
	 * 
	 * @param dir
	 */
	abstract void rotatePiece(int dir);

	/**
	 * Places all of the blocks within this piece.
	 */
	abstract void placePiece();

	/**
	 * Returns the blocks with the lowest Y positions (highest, technically, since
	 * the top of the screen will be measured as 0)
	 * 
	 * @return lowestBlocks
	 */
	abstract HashSet<Block> lowestBlocks();

	/**
	 * Returns all of the blocks that comprise this piece.
	 * 
	 * @return allBlocks
	 */
	abstract HashSet<Block> allBlocks();
}

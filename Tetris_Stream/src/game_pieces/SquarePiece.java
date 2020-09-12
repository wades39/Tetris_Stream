package game_pieces;

import java.awt.Point;
import java.util.HashSet;

public class SquarePiece {

	/**
	 * The position of the center of the piece.
	 */
	private Point centerPos;
	/**
	 * Houses all of the blocks that make up this piece.
	 */
	private HashSet<Block> blocks;
	
	public SquarePiece(Point centerPos) {
		this.centerPos = centerPos;
		
	}

}

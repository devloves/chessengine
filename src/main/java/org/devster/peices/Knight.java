package org.devster.peices;

import org.devster.ChessBoard;
import org.devster.Peice;

import java.awt.image.BufferedImage;

public class Knight extends Peice {
	public Knight(ChessBoard board, int col, int row, boolean isWhite, String name, int cord) {
		super(board, col, row, isWhite, name, cord);
	}
}

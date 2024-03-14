package org.devster;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Objects;

public class Peice {

	public int col, row;
	public int xPos, yPox;

	public boolean isWhite;
	public String name;
	public int value;

	public BufferedImage sheet;
	int sheetScale;
	public Image sprite;

	ChessBoard board;

	public Peice(ChessBoard board, int col, int row, boolean isWhite, String name, int cord) {
		this.board = board;
		this.col = col;
		this.row = row;
		this.xPos = col * board.tileSize;
		this.yPox = row * board.tileSize;
		this.isWhite = isWhite;
		this.name = name;
		try {
			sheet = ImageIO.read(ClassLoader.getSystemResourceAsStream("chess_peices.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(sheet != null) {
			sheetScale =  sheet.getWidth() / 6;
			this.sprite = sheet.getSubimage(cord * sheetScale, isWhite ? 0 : sheetScale, sheetScale, sheetScale).getScaledInstance(board.tileSize, board.tileSize, BufferedImage.SCALE_SMOOTH);
		}
	}

	public void drawPiece(Graphics2D g) {
		if(sprite != null) {
			g.drawImage(sprite, xPos, yPox, null);
		}
		System.out.println(sheet);
	}
}

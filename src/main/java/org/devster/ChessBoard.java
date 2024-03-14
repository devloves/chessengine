package org.devster;

import org.devster.peices.Knight;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ChessBoard extends JPanel {

	public int tileSize = 60;
	int rows = 8;
	int cols = 8;
	ArrayList<Peice> peiceArrayList = new ArrayList<>();

	public ChessBoard() {
		this.setPreferredSize(new Dimension(cols * tileSize, rows * tileSize));
		addPieces();
		this.setBackground(Color.RED);
	}

	public void addPieces() {
		peiceArrayList.add(new Knight(this, 1, 0, false, "Knight", 3));
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;

		for(int r = 0; r < rows; r++)
			for(int c = 0; c < cols; c++) {
				g2d.setColor((c + r) % 2 == 0 ? new Color(151, 212, 104) : new Color(95, 141, 40));
				g2d.fillRect(c * tileSize, r * tileSize, tileSize, tileSize);
			}

		for (Peice peice : peiceArrayList) {
			peice.drawPiece(g2d);
		}
	}

}

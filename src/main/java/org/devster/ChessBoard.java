package org.devster;

import javax.swing.*;
import java.awt.*;

public class ChessBoard extends JPanel {

	public int tileSize = 60;
	int rows = 8;
	int cols = 8;

	public ChessBoard() {
		this.setPreferredSize(new Dimension(cols * tileSize, rows * tileSize));
		this.setBackground(Color.RED);
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2d =  (Graphics2D) g;

		for(int r = 0; r < rows; r++)
			for(int c = 0; c < cols; c++) {
				g2d.setColor((c + r) % 2 == 0 ? Color.WHITE : Color.BLACK);
				g2d.fillRect(c * tileSize, r * tileSize, tileSize, tileSize);
			}
	}

}

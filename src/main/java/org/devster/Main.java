package org.devster;

import javax.swing.*;
import java.awt.*;

public class Main {
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		ChessBoard board = new ChessBoard();
		frame.add(board);
		frame.setMinimumSize(new Dimension(800, 800));
		frame.setLayout(new GridBagLayout());
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
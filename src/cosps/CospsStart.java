package cosps;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class CospsStart extends JPanel {
	private Graphics2D g2d;

	/**
	 * Create the panel.
	 */
	public CospsStart() {
		System.out.println("it was made");
		repaint();
	}

	@Override
	public void paintComponents(Graphics g) {
		System.out.println("made was it");
		super.paintComponents(g);
		g2d = (Graphics2D) g;
		g2d.drawOval(100, 100, 100, 100);
		printText("Hallo und willkommen zu Cosps!");
	}

	private void printText(String string) {
		System.out.println("ew");
		g2d.setFont(new Font("Times New Roman", 100, Font.BOLD));
		g2d.drawString(string, 10, 10);
		System.out.println("madde it");
	}

}

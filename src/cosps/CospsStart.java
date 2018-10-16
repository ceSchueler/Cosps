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
	}

	@Override
	public void paintComponents(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponents(g);
		g2d = (Graphics2D)g;
		printText(g2d,"Hallo und willkommen zu Cosps!");
	}

	private void printText(Graphics g2d,String string) {
		System.out.println("ew");
		g2d.setFont(new Font("Times New Roman",100,Font.BOLD));
		g2d.drawString(string, 10, 10);
		System.out.println("madde it");
	}
	
}

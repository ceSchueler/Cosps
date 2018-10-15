package cosps;

import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class CospsPanel extends JPanel implements MouseListener {
	public int w = getWidth();
	public int h = getHeight();
	public int Rectw = 50;
	public int Recth = 50;
	public int margin = 20;
	public int mouseX=getX();
	public int mouseY=getY();
	public int n;
	public int[] y = new int[n];
	public int[] x = new int[n];
	public boolean[] selected=new boolean[n];
	public Stroke a = new BasicStroke();

	/**
	 * Create the panel.
	 */
	public CospsPanel() {

	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		Graphics g2d = (Graphics2D) g;
		w = getWidth();
		h = getHeight();
		drawRaster(12, g2d);
		selectProgram();
	}

	private void drawRaster(int anz, Graphics g2d) {
		int n = anz;
		int[] y = new int[n];
		int[] x = new int[n];

			 for (int i = 0; i < n; i++) {

				 g2d.drawRect( x[i], y[i], Rectw, Recth);
				 x[i]=(Rectw + margin) * i;
                 if(x[i]>w-Rectw){
					 x[i]=0;
					 y[i] += Recth + 2*margin;
					 i=0;
				 n--;
				 }else{

				 }

			}

	}
	public JPanel selectProgram(MouseEvent e){
		mouseX=getX();
		mouseY=getY();
		for (int i = 0; i <x.length; i++) {
			if(mouseX>x[i]&&mouseX<x[i]+Rectw&&mouseY>y[i]&&mouseY<y[i]+Recth){
				selected[i]=true;
			}
			if(selected[i]){
				CospsFrame.contentPane = new JPanel();
			}
		}

		return null;
	}
	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {

	}

	@Override
	public void mouseReleased(MouseEvent e) {

	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}
}

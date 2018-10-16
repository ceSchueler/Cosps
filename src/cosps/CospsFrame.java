package cosps;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class CospsFrame extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	public static JPanel contentPane;
	public static int Game = 0;
	public static int Game2 = 1;
	public static JPanel Start = new CospsPanel();
	public static JPanel Space = null;
	public static JPanel Error = null;
	public static int PanelX = 100;
	public static int PanelY = 100;
	//public JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CospsFrame frame = new CospsFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		Timer t = new Timer(10, this);
		t.start();
		initComponents();

	}

	/**
	 * Create the frame.
	 */
	private void initComponents() {
		setResizable(false); //RESIZEABLE NEIN
		setIconImage(Toolkit.getDefaultToolkit().getImage(CospsFrame.class.getResource("/com/sun/java/swing/plaf/motif/icons/DesktopIcon.gif")));
		setTitle("Starting Panel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = new CospsPanel();
		setBounds(100, 100, 1000, 800);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
	public CospsFrame() {
		setFocusable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new CospsPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

 	public void actionPerformed(ActionEvent arg0) {
		if (Game2 != Game) {
			chooseGame();
			Game2 = Game;
		}
	}
		public void setGame ( int game){
			Game = game;
			chooseGame();
		}
	public int getGame() {
		 	return Game;
}

		public static void resetGame ( int Game){
			switch (Game) {
				case 0:
					Start = null;
					break;
				case 1:
					Space = null;
					break;
				default:
					Error = null;
					break;
			}
		}

			 public void chooseGame() {
			 	PanelX = (int) getBounds().getLocation().getX(); //Wo Panel am Bildschirm erscheint.
			 	PanelY = (int) getBounds().getLocation().getY();
			 	JPanel temp=Start;
			 	switch (Game) {
			 	case 0:
			 		if (Start == null) {
			 			Start = new CospsPanel();
			 		}
			 		temp = Start;
			 		setBounds(PanelX, PanelY, 500, 200);
			 		setTitle("SpaceInvaders Start");
			 		break;
			 	case 1:
			 		if (Space == null) {
			 			Space = new CospsPanel();
			 		}
			 		temp = Space;
			 		setBounds(PanelX, PanelY, 1000, 600);
			 		setTitle("SpaceInvaders");
			 		break;

			 	default:
//			 		if (Error == null) {
//			 			Error = new Error();
//			 		}
//			 		temp = Error;
//			 		setBounds(PanelX, PanelY, 200, 100);
//			 		setTitle("Error");
			 	}
			 	setContentPane(temp);
			 	revalidate();

			 }


	 	}






import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Runner {

	static int width = 900;
	static int height = 800;
	static JFrame window = new JFrame("FRC PowerUp Simulation");
	static JPanel panel = new JPanel();
	static JButton button1 = new JButton("1");

	public static void main(String args[]) {
		window.setVisible(true);
		window.setLayout(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(width, height);
		panel.setSize(width - 200, height - 200);
		window.add(panel);
		panel.setBackground(Color.CYAN);
		button1.setSize(50, 50);
		button1.setLocation(100, 100);
		panel.add(button1);
	}
}

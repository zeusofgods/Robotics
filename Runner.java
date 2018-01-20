import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Runner {

	static int width = 800;
	static int height = 800;
	static JFrame window = new JFrame("FRC PowerUp Simulation");
	static JButton[] button = new JButton[8];
	static JPanel panel = new JPanel();
	

	public static void main(String args[]) {
		window.setLayout(null);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.setLayout(new GridLayout(4,2));
		panel.setSize(width, height - (height/4));
		panel.setLocation(0, 200);
		
		window.setSize(width, height);
		window.add(panel);
		
		for(int i = 0; i < 8; i++){
			button[i] = new JButton("" + (i+1));
			panel.add(button[i]);
			button[i].addActionListener(new playListener());
		}
//		button.setSize(100, 100);
//		button.setLocation(100, 100);
//		
//		window.add(button);
//		button.addActionListener(new playListener());

		window.setBackground(Color.blue);
		
		
		
		
		
		
		
		
		

	}

}

class playListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent arg0) {

	}
}

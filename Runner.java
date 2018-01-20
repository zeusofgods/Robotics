import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class Runner {

	static int width = 800;
	static int height = 800;
	static JFrame window = new JFrame("FRC PowerUp Simulation");
	static JButton[] button = new JButton[8];
	static JPanel panel = new JPanel();
	static JTextPane stats = new JTextPane();
	static JTextPane action = new JTextPane();

	public static void main(String args[]) {
		Font f = new Font(Font.SANS_SERIF, 3, 75);

		window.setLayout(null);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);

		panel.setLayout(new GridLayout(4, 2));
		panel.setSize(width, height - (height / 4));
		panel.setLocation(0, 200);

		stats.setSize(width / 4, height / 4);
		stats.setText("Stats:");

		action.setSize((width - (width / 4) - 5), height / 4);
		action.setLocation((width / 4) + 5, 0);

		StyledDocument doc = action.getStyledDocument();
		SimpleAttributeSet center = new SimpleAttributeSet();
		StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
		doc.setParagraphAttributes(0, doc.getLength(), center, false);

		action.setFont(f);
		action.setText("Action successful!!");

		window.setSize(width, height);
		window.add(action);
		window.add(panel);
		window.add(stats);

		for (int i = 0; i < 8; i++) {
			button[i] = new JButton("" + (i + 1));
			panel.add(button[i]);
			button[i].addActionListener(new playListener());
		}
		window.setBackground(Color.blue);

	}

}

class playListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent arg0) {

	}
}

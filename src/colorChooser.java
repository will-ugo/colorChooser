import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class colorChooser extends JFrame {
	private JPanel panel;
	private JButton button;
	private Color color = Color.BLACK;
	
	public colorChooser() {
		super("JColorChooser Demo");
		
		panel = new JPanel();
		panel.setBackground(color);
		add(panel, BorderLayout.CENTER);
		
		button = new JButton("Click to select Color");
		button.setBackground(Color.YELLOW);
		button.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent event) {
						color = JColorChooser.showDialog(null, "Select Color", color);
						if (color == null)
							color = Color.BLACK;
						
						panel.setBackground(color);
					}
				}
				);
		add(button, BorderLayout.SOUTH);
	}
}

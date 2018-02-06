import javax.swing.JFrame;

public class colorMain {
	public static void main (String args []) {
		colorChooser chooser = new colorChooser();
		chooser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		chooser.setSize(500, 300);
		chooser.setVisible(true);
	}
}

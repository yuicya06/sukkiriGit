package webapp.sample01;

import javax.swing.JFrame;

public class SampleWindow {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Window Sample");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLocation(1, 15);
		frame.setVisible(true);
	}
}

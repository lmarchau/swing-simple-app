package fr.lmarchau.training.swing;

import javax.swing.JLabel;
import javax.swing.SwingUtilities;

import fr.lmarchau.training.swing.window.CalcWindow;
import fr.lmarchau.training.swing.window.WelcomeWindow;

public class Application {
	
	public static JLabel createLabel() {
		JLabel label = new JLabel("TOTO");
		
		return label;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				WelcomeWindow welcome = new WelcomeWindow();
				welcome.setVisible(true);
			}
		});
	}

}

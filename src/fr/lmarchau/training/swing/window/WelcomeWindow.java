package fr.lmarchau.training.swing.window;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import fr.lmarchau.training.swing.action.WelcomeAction;

public class WelcomeWindow extends JFrame {

	private JTextField field;
	private JLabel message;
	
	public WelcomeWindow() {
		super();
		build();
	}
	
	private void build() {
		setTitle("Hello !!");
		setBackground(Color.CYAN);
		setLocationRelativeTo(null);
		setSize(350, 150);
		setContentPane(buildContent());
	}
	
	private JPanel buildContent() {
		JPanel panel = new JPanel();
		
		field = new JTextField();
		field.setColumns(25);
		panel.add(field);
		
		JButton button = new JButton(new WelcomeAction(this, "Hi !!"));
		panel.add(button);

		message = new JLabel("");
		panel.add(message);

		return panel;
	}
	
	public JTextField getField() {
		return field;
	}
	
	public JLabel getMessage() {
		return message;
	}
	
}

package fr.lmarchau.training.swing.action;

import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.AbstractAction;

import fr.lmarchau.training.swing.window.WelcomeWindow;

public class WelcomeAction extends AbstractAction {

	private WelcomeWindow window;
	
	public WelcomeAction(WelcomeWindow window, String text) {
		super(text);
		this.window = window;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		
		String name = window.getField().getText();
		String message = "";
		LocalDate now = LocalDate.now();
		if (null == name) {
			message = "Welcome, today: " + now.format(DateTimeFormatter.ISO_DATE);
		}
		else {
			message = "Welcome " + name + ", today: " + now.format(DateTimeFormatter.ISO_DATE);
		}
		window.getMessage().setText(message);
	}

}

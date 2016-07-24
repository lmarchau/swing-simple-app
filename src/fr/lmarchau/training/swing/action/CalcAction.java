package fr.lmarchau.training.swing.action;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

import fr.lmarchau.training.swing.window.CalcWindow;

public class CalcAction extends AbstractAction {

	private CalcWindow calcWindow;
	
	public CalcAction(CalcWindow calcWindow, String text) {
		super(text);
		this.calcWindow = calcWindow;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		double nb1 = 0;
		double nb2 = 0;
		String operator = null;
		try {
		nb1 = Double.valueOf(calcWindow.getField1().getText());
		nb2 = Double.valueOf(calcWindow.getField2().getText());
		operator = calcWindow.getOperatorModel().getSelectedOperator();
		} catch (RuntimeException e) {
			JOptionPane.showMessageDialog(calcWindow, "Undefined Field !!");
			return;
		}
		double result = 0;
		switch("" + operator) {
			case "+": {
				result = nb1 + nb2;
				break;
			}
			case "-": {
				result = nb1 - nb2;
				break;
			}
			case "*": {
				result = nb1 * nb2;
				break;
			}
			case "/": {
				result = nb1 / nb2;
				break;
			}
			default: {
				JOptionPane.showMessageDialog(calcWindow, "Undefined operator !!");
				return;
			}
		}
		calcWindow.getLabel().setText("Résultat: " + result); 
	}

}

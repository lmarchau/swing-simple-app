package fr.lmarchau.training.swing.window;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import fr.lmarchau.training.swing.action.CalcAction;
import fr.lmarchau.training.swing.combo.OperatorModel;

public class CalcWindow extends JFrame {

	private JTextField field1;
	private JTextField field2;
	private JComboBox<String> operators; 
	private JLabel label;
	
	public CalcWindow() {
		super();
		build();
	}
	
	private void build() {
		setTitle("Calculatrice"); 
		setSize(400,200); 
		setLocationRelativeTo(null); 
		setResizable(false); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(buildPanel());
	}
	
	private JPanel buildPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setBackground(Color.WHITE);
		
		field1 = new JTextField();
		field1.setColumns(10);
		panel.add(field1);
		
		operators = new JComboBox<>(new OperatorModel());
		panel.add(operators);
		
		field2 = new JTextField();
		field2.setColumns(10);
		panel.add(field2);
		
		JButton button = new JButton(new CalcAction(this, "Calculer"));
		panel.add(button);
		
		label = new JLabel("Pas Encore Calculé !!");
		panel.add(label);
		return panel;
	}
	
	public JTextField getField1() {
		return field1;
	}

	public JTextField getField2() {
		return field2;
	}
	
	public OperatorModel getOperatorModel() {
		return (OperatorModel) operators.getModel();
	}
	
	public JLabel getLabel()  {
		return label;
	}
}

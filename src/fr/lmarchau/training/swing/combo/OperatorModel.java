package fr.lmarchau.training.swing.combo;

import java.util.Arrays;
import java.util.List;

import javax.swing.DefaultComboBoxModel;

public class OperatorModel extends DefaultComboBoxModel {

	private List<String> operators;
	
	public OperatorModel() {
		super();
		operators = Arrays.asList("+", "-", "*", "/");
	}
	
	public String getSelectedOperator() {
		return (String) getSelectedItem();
	}

	@Override
	public Object getElementAt(int index) {
		
		return operators.get(index);
	}

	@Override
	public int getIndexOf(Object element) {
		return operators.indexOf(element);
	}

	@Override
	public int getSize() {
		return operators.size();
	}
	
	
	
}

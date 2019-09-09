package org.surreal.survivabilityGui.gui;

import javax.swing.JComboBox;

public class ComboDataProvider extends JComboBox<String> implements GuiDataProvider {

	@Override
	public String getSelectionValue() {
		String retval = this.getSelectedItem().toString();
		return retval;
	}

}

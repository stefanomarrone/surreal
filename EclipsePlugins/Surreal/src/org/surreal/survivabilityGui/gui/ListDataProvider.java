package org.surreal.survivabilityGui.gui;

import java.util.List;

import javax.swing.JList;

public class ListDataProvider extends JList<String> implements GuiDataProvider {

	@Override
	public String getSelectionValue() {
		String retval = "[";
		List<String> selected = this.getSelectedValuesList();
		for (String s: selected) {
			retval += s + ",";
		}
		retval = retval.substring(0,retval.length()-1) + "]";
		return retval;
	}

}

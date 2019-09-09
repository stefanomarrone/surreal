package org.surreal.survivabilityGui.gui;

import java.util.Enumeration;
import java.util.Hashtable;

import javax.swing.JCheckBox;

import org.surreal.engine.query.QueryBinding;

public class GuiQIElement {
	private String qid;
	
	private JCheckBox check;
	
	private Hashtable<String,GuiDataProvider> params;
	
	public GuiQIElement(String q, JCheckBox checkFlag) {
		this.qid = q;
		this.check = checkFlag;
		this.params = new Hashtable<String,GuiDataProvider>();		
	}
	
	public void addParam(String name,GuiDataProvider element) {
		this.params.put(name,element);		
	}
	
	public QueryBinding generateBinding() {
		QueryBinding retval = null;
		int counter = 0;
		if (this.check.isSelected()) {
			retval = new QueryBinding(counter,this.qid);
			Enumeration<String> temp = this.params.keys();
			while (temp.hasMoreElements()) {
				String name = temp.nextElement();
				GuiDataProvider provider = this.params.get(name);
				String value = provider.getSelectionValue();
				retval.addBindingEntry(name,value);
			}
			counter++;
		}
		return retval;
	}
}
package org.surreal.survivabilityGui.gui;

import java.util.Vector;

import org.surreal.engine.query.QueryBinding;
import org.surreal.engine.query.QueryInstantiation;

public class GuiQIData {

	private Vector<GuiQIElement> guiElements;
	
	public GuiQIData() {
		this.guiElements = new Vector<GuiQIElement>();
	}
	
	public void addElement(GuiQIElement e) {
		this.guiElements.addElement(e);
	}
	
	public QueryInstantiation generateInstantiation() {
		QueryInstantiation retval = new QueryInstantiation();
		for (GuiQIElement e: this.guiElements) {
			QueryBinding temp = e.generateBinding();
			if (temp != null) {
				retval.add(temp);				
			}
		}
		return retval;
	}
}

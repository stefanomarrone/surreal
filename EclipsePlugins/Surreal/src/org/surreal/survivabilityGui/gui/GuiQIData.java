package org.surreal.survivabilityGui.gui;

import java.util.Vector;

import org.surreal.engine.query.QueryInstantiation;
import org.surreal.engine.query.QueryInstantiationDocument;

public class GuiQIData {

	private Vector<GuiQIElement> guiElements;
	
	public GuiQIData() {
		this.guiElements = new Vector<GuiQIElement>();
	}
	
	public void addElement(GuiQIElement e) {
		this.guiElements.addElement(e);
	}
	
	public QueryInstantiationDocument generateInstantiation() {
		QueryInstantiationDocument retval = new QueryInstantiationDocument();
		for (GuiQIElement e: this.guiElements) {
			QueryInstantiation temp = e.generateBinding();
			if (temp != null) {
				retval.add(temp);				
			}
		}
		return retval;
	}
}

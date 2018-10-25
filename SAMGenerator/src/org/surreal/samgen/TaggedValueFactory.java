package org.surreal.samgen;

public class TaggedValueFactory {
	
	public static TaggedValue generate(String stereotype, String taggedvalue) {
		TaggedValue retval = null;
		if (stereotype.equals("service")) {
			if (taggedvalue.equals("Index")) {
				retval = new ServiceIndex();
			}
		} else if (stereotype.equals("misuse")) {
			if (taggedvalue.equals("Affection")) {
				retval = new MisuseAffects();
			}
		} 
		return retval;
	}
}
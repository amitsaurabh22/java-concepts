package com.test;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "readOnlyField")
public class ReadOnlyField {

	private List<Field> field;

	public List<Field> getField() {
		if (field == null) {
			field = new ArrayList<Field>();
		}
		return field;
	}

	public void setField(List<Field> field) {
		this.field = field;
	}



}

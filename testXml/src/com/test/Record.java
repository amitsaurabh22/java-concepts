package com.test;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;

public class Record {

	private String id;
	private ReadOnlyField readOnlyField;

	List<Field> field;

	@XmlAttribute(name = "id")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ReadOnlyField getReadOnlyField() {
		return readOnlyField;
	}

	public void setReadOnlyField(ReadOnlyField readOnlyField) {
		this.readOnlyField = readOnlyField;
	}


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

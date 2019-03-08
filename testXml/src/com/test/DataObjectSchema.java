package com.test;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "data_object_schema")
public class DataObjectSchema {

	private String name;
	private List<Record> record;

	@XmlAttribute(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@XmlElement(name = "record")
	public List<Record> getRecord() {

		if (record == null) {
			record = new ArrayList<Record>();
		}
		return record;
	}

	public void setRecord(List<Record> record) {
		this.record = record;
	}

}

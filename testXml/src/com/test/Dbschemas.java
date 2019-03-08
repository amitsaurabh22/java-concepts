package com.test;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "dbschemas")
public class Dbschemas {

	private DataObjectSchema data_object_schema;

	public DataObjectSchema getData_object_schema() {
		return data_object_schema;
	}

	public void setData_object_schema(DataObjectSchema data_object_schema) {
		this.data_object_schema = data_object_schema;
	}

}

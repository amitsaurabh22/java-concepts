package com.test;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class TestXmlMain {

	public static void main(String[] args) {
		JAXBContext jaxbContext;
		try {

			Dbschemas dbs = setTheValue();
			jaxbContext = JAXBContext.newInstance(Dbschemas.class);

			Marshaller marshaller = jaxbContext.createMarshaller();

			StringWriter writer = new StringWriter();
			marshaller.marshal(dbs, writer);



			System.out.println(writer.toString());
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static Dbschemas setTheValue() {

		Dbschemas dbs = new Dbschemas();
		DataObjectSchema dos = new DataObjectSchema();
		dos.setName("FCZoneReference");
		dbs.setData_object_schema(dos);
		Record rec = new Record();
		rec.setId("");
		dos.getRecord().add(rec);
		ReadOnlyField readOnlyField = new ReadOnlyField();
		rec.setReadOnlyField(readOnlyField);
		Field field = new Field("class", "java.lang.Class", "class com.emc.storageos.db.client.model.FCZoneReference");
		Field fieldId = new Field("id", "java.net.URI", "");
		readOnlyField.getField().add(field);
		readOnlyField.getField().add(fieldId);

		Field fieldinactive = new Field("inactive", "java.lang.Boolean", "false");
		Field fieldfabricId = new Field("fabricId", "java.lang.String", "Brocade Site 1");
		rec.getField().add(fieldinactive);
		rec.getField().add(fieldfabricId);
		return dbs;

	}
}
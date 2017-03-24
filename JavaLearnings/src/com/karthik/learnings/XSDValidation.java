package com.karthik.learnings;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

public class XSDValidation {

	public static void main(String args[]) {
		String xsdPath = "src\\resources\\students.xsd";
		String xmlPath = "src\\resources\\students.xml";
		String xmlStr = "<class><student><firstname>fname</firstname><lastname>lname</lastname><nickname>nname</nickname><marks>100</marks></student></class>";

		if (validateXmlFile(xmlPath, xsdPath))
			System.out.println("Valid XML File");
		else
			System.out.println("Invalid XML File");

		if (validateXmlString(xmlStr, xsdPath))
			System.out.println("Valid XML String");
		else
			System.out.println("Invalid XML String");
	}

	private static boolean validateXmlFile(String xmlPath, String xsdPath) {
		SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		boolean isValid = true;
		try {
			Schema schema = factory.newSchema(new File(xsdPath));
			Validator validator = schema.newValidator();
			validator.validate(new StreamSource(new File(xmlPath)));
		} catch (SAXException | IOException e) {
			isValid = false;
			e.printStackTrace();
		}
		return isValid;
	}

	private static boolean validateXmlString(String xml, String xsdPath) {
		SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		boolean isValid = true;
		try {
			Schema schema = factory.newSchema(new File(xsdPath));
			Validator validator = schema.newValidator();
			validator.validate(new StreamSource(new StringReader(xml)));
		} catch (SAXException | IOException e) {
			isValid = false;
			e.printStackTrace();
		}
		return isValid;
	}

}

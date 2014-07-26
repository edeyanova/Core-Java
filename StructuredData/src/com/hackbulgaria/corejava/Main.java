package com.hackbulgaria.corejava;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


public class Main {
	private static final String F_XML = "./metawiki-latest-stub-articles.xml";
	public static void main(String[] args) throws JAXBException, FileNotFoundException{
		
		CoreJavaCourse sth = new CoreJavaCourse();
		
		JAXBContext context = JAXBContext.newInstance(CoreJavaCourse.class, Student.class);
	    Marshaller m = context.createMarshaller();
	    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

	    m.marshal(sth, System.out);

	    m.marshal(sth, new File(F_XML));
	    
	    System.out.println();
	    System.out.println("Output from our XML File: ");
	    Unmarshaller m1 = context.createUnmarshaller();
	    CoreJavaCourse java = (CoreJavaCourse) m1.unmarshal(new FileReader(F_XML));
	    
	    

	}

}

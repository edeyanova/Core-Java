package com.hackbulgaria.corejava;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Parsing {
	 public static void main(String argv[]) {
		 try {
			 SAXParserFactory factory = SAXParserFactory.newInstance();
			 SAXParser saxParser = factory.newSAXParser();
			 
			 DefaultHandler handler = new DefaultHandler() {
				    boolean title = false;
					boolean ns = false;
					boolean id = false;
				 
					public void startElement(String uri, String localName,String qName, 
			                Attributes attributes) throws SAXException {
						System.out.println("Start Element :" + qName);
						
						if (qName.equalsIgnoreCase("TITLE")) {
							title = true;
						}
					}
					public void endElement(String uri, String localName,
							String qName) throws SAXException {
						System.out.println("End Element :" + qName);

					}
					public void characters(char ch[], int start, int length) throws SAXException {
						if (title) {
							System.out.println("Title : " + new String(ch, start, length));
							title = false;

						}
					}

			 };
			 saxParser.parse("C:/Users/Elina/Desktop/Ecl/XML/src/Pages.xml", handler);

		 } catch (Exception e) {
			 e.printStackTrace();
		 }
	 }
}

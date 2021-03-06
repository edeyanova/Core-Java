package com.hackbulgaria.corejava;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

public class ReadXml {
	
	public static void main(String argv[]) {

		try {
			File fXml = new File("C:/Users/Elina/Desktop/Ecl/XML/src/Pages.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXml);
			
			doc.getDocumentElement().normalize();
			
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			
			NodeList nList = doc.getElementsByTagName("Page");
			
			System.out.println("----------------------------");

			for (int temp = 0; temp < nList.getLength(); temp++)  {
				Node nNode = nList.item(temp);
				
				System.out.println("\nCurrent Element :" + nNode.getNodeName());

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					
					System.out.println("Page id : " + eElement.getAttribute("id"));
					System.out.println("title : " + eElement.getElementsByTagName("title").item(0).getTextContent());
					System.out.println("ns : " + eElement.getElementsByTagName("ns").item(0).getTextContent());
					

				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

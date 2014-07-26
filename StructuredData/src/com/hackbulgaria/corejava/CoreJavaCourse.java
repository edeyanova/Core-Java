package com.hackbulgaria.corejava;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CoreJavaCourse{
	List<Student> enrolledStudent;
	private int courseId;
	private String courseName;
	
}

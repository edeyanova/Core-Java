package com.hackbulgaria.corejava;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Student {
	private int studentId;
	private String name;
	
	public Student() {
    }


    public Student(int studentId, String name) {
        super();
        this.studentId = studentId;
        this.name = name;
    }


    public int getStudentId() {
        return studentId;
    }


    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", name=" + name + "]";
    }
}

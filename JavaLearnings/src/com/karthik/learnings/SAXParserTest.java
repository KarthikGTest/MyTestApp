package com.karthik.learnings;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SAXParserTest {
   public static void main(String[] args){

      try {	
         File inputFile = new File("src\\resources\\students.xml");
         SAXParserFactory factory = SAXParserFactory.newInstance();
         SAXParser saxParser = factory.newSAXParser();
         UserHandler userhandler = new UserHandler();
         saxParser.parse(inputFile, userhandler);
         List<Student> studentList = userhandler.getStudentList();
         System.out.println("No of student : " + studentList.size());
      } catch (Exception e) {
         e.printStackTrace();
      }
   }   
}

class UserHandler extends DefaultHandler {

   boolean bFirstName = false;
   boolean bLastName = false;
   boolean bNickName = false;
   boolean bMarks = false;
   Student student;
   List<Student> studentList;

   @Override
   public void startElement(String uri, 
      String localName, String qName, Attributes attributes)
         throws SAXException {
	   if(qName.equalsIgnoreCase("class")){
		   studentList = new ArrayList<Student>();
	   }
      if (qName.equalsIgnoreCase("student")) {
    	  student = new Student();
          String rollNo = attributes.getValue("rollno");
    	  student.setRollNo(Integer.parseInt(rollNo));
      } else if (qName.equalsIgnoreCase("firstname")) {
         bFirstName = true;
      } else if (qName.equalsIgnoreCase("lastname")) {
         bLastName = true;
      } else if (qName.equalsIgnoreCase("nickname")) {
         bNickName = true;
      }
      else if (qName.equalsIgnoreCase("marks")) {
         bMarks = true;
      }
   }

   @Override
   public void endElement(String uri, 
      String localName, String qName) throws SAXException {
      if (qName.equalsIgnoreCase("student")) {
         studentList.add(student);
      }
   }

   @Override
   public void characters(char ch[], 
      int start, int length) throws SAXException {
      if (bFirstName) {
    	  student.setFirstName(new String(ch, start, length));
         bFirstName = false;
      } else if (bLastName) {
         student.setLastName(new String(ch, start, length));
         bLastName = false;
      } else if (bNickName) {
         student.setNickName(new String(ch, start, length));
         bNickName = false;
      } else if (bMarks) {
         student.setMarks(Integer.parseInt(new String(ch, start, length)));
         bMarks = false;
      }
   }

public Student getStudent() {
	return student;
}

public void setStudent(Student student) {
	this.student = student;
}

public List<Student> getStudentList() {
	return studentList;
}

public void setStudentList(List<Student> studentList) {
	this.studentList = studentList;
}
}

class Student {
	
	private String firstName;
	private String lastName;
	private String nickName;
	private int marks;
	private int rollNo;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

}
package Encapsulation;

public class Student_encapsulation {

	private int studentID;
	private String  name;
	public  String  schoolname="kvs";
	
	public String getname()
	{
		return name;
	}

	public void setname(String name)
	{
		this.name=name;
	}
	public int getstudentID()
	{
		return studentID;
	}

	public void setstudentID(int ID)
	{
		this.studentID=ID;
	}

}

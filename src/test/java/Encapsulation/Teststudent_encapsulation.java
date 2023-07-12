package Encapsulation;

public class Teststudent_encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student_encapsulation teststudent= new Student_encapsulation();
		
		teststudent.setname("Ramachandra");
		teststudent.setstudentID(123);
		System.out.println(teststudent.getstudentID());
		System.out.println(teststudent.getname());
		System.out.println(teststudent.schoolname);
		
	}

}

package org.fully;
//child class
//Fully abstraction
//Multiple Inheritance
//Hybrid inheritance
public class College extends Bus implements Student,Staff {

	@Override
	public void stuId() {
		System.out.println("The student id is 6767");
		
	}

	@Override
	public void stuName() {
		System.out.println("The student name is Ram");
		
	}
	public static void main(String[] args) {
		College c = new College();
		c.stuId();
		c.stuName();
		c.staffId();
		c.staffName();
		c.busFee();
	}

	@Override
	public void staffId() {
		System.out.println("The staff id 67676");
		
	}

	@Override
	public void staffName() {
		
		System.out.println("The staff name is Manoj");
	}

	
	

	

	
	
	

}

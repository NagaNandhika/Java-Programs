package org.abs;

public class College extends Student {

	@Override
	public void stuId() {
		System.out.println("The student id is 7878");
		
	}
	public static void main(String[] args) {
		College c = new College();
		c.stuId();
		c.stuName();
	}

	

	
	

	
	
}

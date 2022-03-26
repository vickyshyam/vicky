package cololection;

public class Company extends Employee{
	
	private void cmpId() {
	  System.out.println("company id is 133");

	}
	private void cmpName() {
      System.out.println("company vi");
	}
	
	
	public static void main(String[] args) {
		
		Company c = new Company();
		c.cmpId();
		c.cmpName();
		c.empId();
		
		
	}
	


}

package multilevel_inheritace;

import java.util.Date;

public class levelOne_employee extends Employee{
	
	private String authority;
	private int noOfShares;
	
	
	public levelOne_employee(String name, long contactNo, Date dateofBirth, String deptName, double baseSalary,String authority,int noOfShares) {
		super(name,contactNo,dateofBirth,deptName,baseSalary);
		this.authority=authority;
		this.noOfShares=noOfShares;
	}
	

}

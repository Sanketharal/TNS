package multilevel_inheritace;

import java.util.Date;

public class Employee extends Person {
private String deptName;
private double baseSalary;


public Employee(String name, long contactNo, Date dateofBirth, String deptName, double baseSalary) {
	super(name,contactNo,dateofBirth);
	this.baseSalary=baseSalary;
	this.deptName=deptName;
}

public String getDeptName() {
	return deptName;
}

public void setDeptName(String deptName) {
	this.deptName = deptName;
}

public double getBaseSalary() {
	return baseSalary;
}

public void setBaseSalary(double baseSalary) {
	this.baseSalary = baseSalary;
}

@Override
public String toString() {
	return "Employee [deptName=" + deptName + ", baseSalary=" + baseSalary + ", getName()=" + getName()
			+ ", getContactNo()=" + getContactNo() + ", getDateofBirth()=" + getDateofBirth() + ", toString()="
			+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
}
}



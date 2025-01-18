package oops_concept;

public class Student extends Citizen {

	private int rollNo;
	private String collegeName;
	
	public Student() {
		
		super();
		
	}
	
	public Student(String name, String adharno,String address, String phno, int rollNo, String collegeName){
		
		super(name,adharno,address,phno);
		this.rollNo=rollNo;
		this.collegeName=collegeName;
	}
	
	
	
    public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	

@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", getName()=" + getName()
				+ ", getAdharno()=" + getAdharno() + ", getAddress()=" + getAddress() + ", getPhno()=" + getPhno()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}


}

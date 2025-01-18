package oops_concept;

public class Citizen {
 private String name;
 private String adharno;
 private String address;
 private String phno;
 
 public Citizen() {
	 System.out.println("Citizen object created");
 }
 
 public Citizen(String name, String adharno,String address, String phno) {
	 this.name=name;
	 this.adharno=adharno;
	 this.address=address;
	 this.phno=phno;
	
 }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAdharno() {
	return adharno;
}

public void setAdharno(String adharno) {
	this.adharno = adharno;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getPhno() {
	return phno;
}

public void setPhno(String phno) {
	this.phno = phno;
}
 
 
 
}

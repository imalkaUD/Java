package ex1;

public class Student {
	String name, ditNo, address;//using default constructor -- 1

	//setters & getters --3
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDitNo() {
		return ditNo;
	}

	public void setDitNo(String ditNo) {
		this.ditNo = ditNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	//add a method called getDetails()   ---4
	public  String getDetails() {
		String s = "I am a Student.\nMy name is " + getName() + 
				"\nI am from " + getAddress() + 
				"\nMy ditNo is " + getDitNo() + "\n";
		
		return s;
	}
	
	//overloaded constructor  --2
	/*public Student(String pname, String pditNo, String paddress) {
		name = pname;
		ditNo = pditNo;
		address = paddress;
	};*/
	
}

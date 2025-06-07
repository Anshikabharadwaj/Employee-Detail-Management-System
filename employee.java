package employee.model;

public class employee {
	
	private int id;   //ENtity class
	private String fname;
	private String lname;
	private String gend;
	private String dob;
	private int age;
	
	
	public employee() {
		
	}


	public employee(int id, String fname, String lname, String gend, String dob, int age) {
			setId(id);
			setFname(fname);
			setLname(lname);
			setGend(gend);
			setDob(dob);
			setAge(age);
	}
	
	public employee(String fname, String lname, String gend, String dob, int age) {
//		setId(id);
		setFname(fname);
		setLname(lname);
		setGend(gend);
		setDob(dob);
		setAge(age);		
	}
	
	public employee(int id) {
		setId(id);
	}
	
	
	public void Display() {
		System.out.println("Id : " + id );
		System.out.println("fname : " + fname);
		System.out.println("lname : " + lname);
		System.out.println("gender : " + gend);
		System.out.println("dob :" + dob);
		System.out.println("age : " + age);
	}
	
	@Override
	public String toString() {
		return "employee [id=" + id + ", fname=" + fname + ", lname=" + lname + ", gend=" + gend + ", dob=" + dob
				+ ", age=" + age + "]";
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getGend() {
		return gend;
	}


	public void setGend(String gend) {
		this.gend = gend;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}
//

	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		if(age>18 && age<=70) {
			
			this.age = age;
		}else {
			throw new IllegalArgumentException("Invalid age!!");
		}
	}


		
	
	
	
	
	
	
	
	
	
	
	

}

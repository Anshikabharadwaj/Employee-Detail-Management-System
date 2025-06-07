package employee.view;

import java.util.Scanner;

public class employeeView {
	
	public Scanner sc = new Scanner(System.in);
	
	
	public int showMenu() {
		System.out.println("Enter 1 to insert");
		System.out.println("Enter 2 to Delete");
		System.out.println("Enter 3 to update");
		System.out.println("Enter 4 to show");
		System.out.println("Enter 5 to sort by name");
		System.out.println("Enter 6 to sort by id");
		System.out.println("Enter 7 to  exit");
//		System.out.println("Enter 8 to exit");
		return sc.nextInt();
	}
	
	public int getId() {
		System.out.println("Enter Id: ");
		return sc.nextInt();
	}
	
	public String getFname() {
		System.out.println("Enter name : ");
		sc.nextLine();
		return sc.nextLine();
	}
	
	public String getLname() {
		System.out.println("Enter last name : ");
//		sc.nextLine();
		return sc.nextLine();
	}
	
	public String getGend() {
		System.out.println("Enter gender : ");
//		sc.nextLine();
		return sc.nextLine();
	}
	
	public String getDob() {
		System.out.println("Enter DOB : ");
//		sc.nextLine();
		return sc.nextLine();
	}
	
	public int getAge() {
		System.out.println("Enter age : ");
		return sc.nextInt();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}

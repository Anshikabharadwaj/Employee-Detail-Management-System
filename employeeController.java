package employee.controller;

import java.util.ArrayList;

import employee.model.employee;
import employee.model.employeeDao;
import employee.view.employeeView;

public class employeeController {

	public employeeDao dao;
	public employeeView view;
	
	public employeeController(employeeDao dao, employeeView view) {
		this.dao = dao;
		this.view = view;
	}
	
	public void run() {
		while(true) {
			int choice = view.showMenu();
			switch(choice) {
			
			case 1: {
				int id = view.getId();
				String name = view.getFname();
				String lname = view.getLname();
				String gend = view.getGend();
				String Dob = view.getDob();
				int age = view.getAge();
				employee e = new employee(id, name, lname,gend,Dob,age);
				dao.insert(e);
				}
					break;
					
			case 2: {
				int id = view.getId();
				employee e = new employee(id);
				dao.Delete(e);
			}
				
				break;
			case 3: {
				int id = view.getId();
				String name = view.getFname();
				String lname = view.getLname();
				String gend = view.getGend();
				String Dob = view.getDob();
				int age = view.getAge();
				employee e = new employee(id, name, lname,gend,Dob,age);
				dao.insert(e);
			}
				break;
			case 4 : {
				ArrayList<employee> ar = dao.showData();
				for(employee e : ar) {
					System.out.println("Id" + e.getId() + "\t" + "name : " + e.getFname() + "\t " + "Lname : " + e.getLname() 
					+ "\t" + "gender : " +  e.getGend() + "\t" + "dob" + e.getDob() + "\t" + "age : " + e.getAge());      //sbb object ke information bata dega not IMP
				}
			}
			break;
			case 5 : {
				ArrayList<employee> alist = dao.showData();
				alist.sort((a, b) -> (a.getFname().compareTo(b.getFname())));
				alist.forEach((a) -> a.Display());
			}
			break;
			
			case 6 : {
				ArrayList<employee> alist = dao.showData();
				alist.sort((a, b) -> (a.getId() - b.getId()));
				alist.forEach((a) -> a.Display());
			}
			break;
			
//			case 7 : {
//				ArrayList<employee> alist = dao.showData();
//				alist.sort((a, b) -> (a.getFname().compareTo(b.getFname())));
//				alist.forEach((a) -> a.Display());
//
//			}				
			case 7 : 
					System.out.println("Exit");
					return;
					
				default : 
					System.out.println("Invalid number");
			}
			}
		}
	}
	
	


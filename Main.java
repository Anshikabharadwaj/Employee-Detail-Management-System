package employeee;

import employee.controller.employeeController;
import employee.model.employeeDao;
import employee.view.employeeView;

public class Main {

	public static void main(String[] args) {

		employeeDao dao = new employeeDao();
		employeeView view = new employeeView();
		employeeController controller = new employeeController(dao, view);
		controller.run();
	}

}

package oop2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Logger logger = new DatabaseLogger();
		
		Employee employee = new Employee();
		CustomerManager customerManager = new CustomerManager(logger);
		customerManager.add(new Customer());
		List<Logger> lists = new ArrayList<>();
		lists.add(new ElasticLogger());
		EmployeeManager employeeManager = new EmployeeManager(lists);
		employeeManager.add(employee);
		
	}

}

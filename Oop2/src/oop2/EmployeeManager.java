package oop2;

import java.util.List;

public class EmployeeManager {
	private List<Logger> loggers;
	public EmployeeManager(List<Logger> loggers) {
		this.loggers = loggers; 
	}
	public void add(Employee employee) {
		System.out.println("employee added");
		runLoggers(employee);
	}
	public void update(Employee employee) {
		System.out.println("Employee updated");
		runLoggers(employee);
	}
	private void runLoggers(Employee employee) {
		for(Logger logger:loggers) {
			logger.log(employee.getFirstName());
		}
	}
}

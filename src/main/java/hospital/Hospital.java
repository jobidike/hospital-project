package hospital;

import java.util.Collection;  //* means all
import java.util.HashMap;
import java.util.Map;


public class Hospital { //maintenance
	
	//Make a map to house employees
	private Map<String, HospitalEmployee> hospitalEmployees = new HashMap<String, HospitalEmployee>();
	
	//Create a collection to show values
	public Collection<HospitalEmployee> allEmployees() {
		return hospitalEmployees.values();
	}
		//Be able to add an employee
	public void addEmployee(HospitalEmployee employee) {
		hospitalEmployees.put(employee.getEmpNumber(), employee);
	}
		//Be able to fire an employee
	public void fireEmployee(String empNumber) {
		hospitalEmployees.remove(empNumber);
	}
	
	

		
	

}

package hospital;

public abstract class HospitalEmployee {  //model class
	
	protected String empName;  //instance data properties of an object
	protected String empNumber;
	
	protected int patientHealth = 10; //can only be influenced inside of that hospital package, not instance data
	
	public HospitalEmployee(String empName, String empNumber) { //String for empNumber because just an identifier
		this.empName=empName; //constructor
		this.empNumber=empNumber;
	}

	public String getEmpName() {  //add setter if i think employee name change might happen
		return empName;
	}

	public String getEmpNumber() {
		return empNumber;
	}
	
	public int getPatientHealth() {
		return patientHealth;
	}
	
	abstract double calculatePay();  //ensure all employees get paid
	
	
	
	@Override
	public String toString() {  //return location of that class with an @ symbol
		return empName + "\t" + empNumber;	
	}

}

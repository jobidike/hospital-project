package hospital;

public class Receptionist extends HospitalEmployee {
	
	protected boolean isAnswering;

	public Receptionist(String empName, String empNumber, boolean isAnswering) {
		super(empName, empNumber);
		this.isAnswering=isAnswering;
	}
	
	public boolean checkIfAnswering() {
		return isAnswering;
	}

	@Override
	double calculatePay() {
		return 45000;
	}
	
	@Override
	public String toString() {  //return location of that class with an @ symbol
		return super.toString() + "\t" + isAnswering;
	}
	
	

}

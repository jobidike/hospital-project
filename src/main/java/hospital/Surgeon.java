package hospital;

public class Surgeon extends Doctor {
	
	protected boolean isOperating;

	public Surgeon(String empName, String empNumber, String specialty, boolean isOperating) {
		super(empName, empNumber, specialty);
		this.isOperating=isOperating;
	}
	public boolean checkIfOperating() {
		return isOperating;
	}
	
	@Override
	double calculatePay() {
		return 120000;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "\t" + isOperating;
	}
	

}

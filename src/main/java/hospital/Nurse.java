package hospital;

public class Nurse extends HospitalEmployee implements MedicalDuties {
	
	protected int numPatients; 

	public Nurse(String empName, String empNumber, int numPatients) {
		super(empName, empNumber);
		this.numPatients=numPatients;
		
	}
	public Nurse(String empName, String empNumber) {
		super(empName, empNumber);  //overload constructor the numPatients
		numPatients = 0;
	}

	@Override
	double calculatePay() {
		return 50000;
	}
	public int getNumPatients() {
		return numPatients;
	}
	@Override //defining how you use it
	public boolean drawBlood() {
		return true;
	}
	@Override
	public void careForPatient() {
		patientHealth +=5;
	}
	
	@Override
	public String toString() {  //return location of that class with an @ symbol
		return super.toString() +  "\t" +  numPatients;
	}
	

}

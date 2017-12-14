package hospital;

public class Doctor extends HospitalEmployee implements MedicalDuties {
	
	protected String specialty;
	
	public Doctor(String empName, String empNumber, String specialty) { //write super instead of calling hospital employee
		super(empName, empNumber);  //super is saying i will pass this from super class, using constructor of super class(hospital employee
		this.specialty = specialty;
	}
	
	public String getSpecialty() {
		return specialty;
	}

	@Override
	double calculatePay() {
		return 90000;
	}
	@Override
	public boolean drawBlood() {
		return true;
	}
	@Override
	public void careForPatient() { //if i want to test this method test it for 20, I would leave it blank then run it then put in patientHealth*=2
		patientHealth *=2;  //double our patient health
	}
	
	@Override
	public String toString() {
		return super.toString() + "\t" + specialty;
	}

}

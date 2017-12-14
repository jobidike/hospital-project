package hospital;

public class EmergencyDispatcher extends Receptionist implements MedicalDuties {
	
	public EmergencyDispatcher(String empName, String empNumber, boolean isAnswering) {
		super(empName, empNumber, isAnswering);

	}
	
	@Override
	double calculatePay() {
		return 45000;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public boolean drawBlood() {
		return true;
	}

	@Override
	public void careForPatient() {
		patientHealth +=5;
		
	}

}


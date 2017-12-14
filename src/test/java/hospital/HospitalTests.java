package hospital;

import static org.junit.Assert.*;

import org.junit.Test;

public class HospitalTests {  //test are mainly for methods
	
	@Test
	public void shouldBeAbleToCreateADoctorObject() {
		Doctor underTest = new Doctor("","","");  //3 peices of data
		assertNotNull(underTest);
	
	}
	@Test
	public void assertThatDoctorIsAHospitalEmployee() {
		HospitalEmployee  underTest= new Doctor("","","");  //3 peices of data
		assertNotNull(underTest); //not all hospital employees are doctors but all doctors are hospitalemployees
	}
	
	@Test
	public void assertThatPatientHealthIs20() {
		Doctor underTest = new Doctor("","","");  //3 peices of data
		underTest.careForPatient();
		int check = underTest.getPatientHealth();
		assertEquals(20,check);
	}
	@Test
	public void assertThatSurgeonSalaryIs120() {
		Surgeon underTest = new Surgeon("","","",true);
		double check = underTest.calculatePay();
		assertEquals(120000,check,0);  //fails first because it looks at doctor which is 90000
	}
	

}

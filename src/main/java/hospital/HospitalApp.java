package hospital;

public class HospitalApp {

	public static void main(String[] args) {
		
		Hospital hospital = new Hospital();  //new is every time you make an object
		
		Doctor phil = new Doctor("Phil","111","Brian");
		Surgeon harrison = new Surgeon("Harry","222","Plastic",true);
		Nurse jackie = new Nurse("Jackie","333",6);
		Receptionist janine = new Receptionist("Janine","444",true);
		Janitor rosie = new Janitor("Rosie","555",true);
		EmergencyDispatcher tina = new EmergencyDispatcher("Tina", "666", false);
		
		hospital.addEmployee(phil);
		hospital.addEmployee(harrison);
		hospital.addEmployee(jackie);
		hospital.addEmployee(janine);
		hospital.addEmployee(rosie);
		hospital.addEmployee(tina);
		
		System.out.println("Here are the employees at High St. Hospital.");  ////or do this way:  hospital.allEmployees();
		for(HospitalEmployee currentEmp: hospital.allEmployees()) {
			System.out.println(currentEmp); //dot operator to show name, etc
		}
		System.out.println("\nHere are the pay rates at High St. Hospital");
		for(HospitalEmployee currentEmp: hospital.allEmployees()) {
			System.out.println(currentEmp.getEmpName() + " gets paid a " + "salary of " + currentEmp.calculatePay());
		}
		System.out.println("\nSome employees can administer patient care.");
		for(HospitalEmployee currentEmp: hospital.allEmployees()) {
			if(currentEmp instanceof MedicalDuties) {   //this way shows everyone instead of doing one at a time
			 ((MedicalDuties)currentEmp).careForPatient();
			 System.out.println(currentEmp.getEmpName() + " has increased "
			 + " patient health to " + currentEmp.getPatientHealth());
			}
		}
			 //if(currentEmp instanceof Nurse) {   if you want to display one at a time
			//((Nurse)currentEmp).careForPatient(); 
			//System.out.println(currentEmp.getEmpName() + " has increased " 
			//+ " patient health to " + currentEmp.getPatientHealth());
		 System.out.println("\nSome employees can draw blood.");
		 for(HospitalEmployee currentEmp: hospital.allEmployees()) {
			 if(currentEmp instanceof MedicalDuties) {
			((MedicalDuties)currentEmp).drawBlood();
			System.out.println(currentEmp.getEmpName() + " can draw blood.");
			 }
		 }
		 
//		 System.out.println("Which employee do you want?");
//		 for(HospitalEmployee currentEmp: hospital.()) {
//			 System.out.println(currentEmp.getEmpName() + );
//		 }
		
		
		

	}

}

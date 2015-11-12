public class HospitalManager {
	private Patient patientListStart = null;
	
	public void launch() {
		Patient p1 = new Patient("John", 37, "Swine Flu");
		patientListStart = p1;
		Patient p2 = new Patient("Sam", 30, "Common cold");
		patientListStart.addPatient(p2);
		Patient p3 = new Patient("Adam", 29, "Sore throat");
		patientListStart.addPatient(p3);
		Patient p4 = new Patient("Jane", 30, "broken leg");
		patientListStart.addPatient(p4);
		Patient p5 = new Patient("Cath", 30, "swollen knee");
		patientListStart.addPatient(p5);
		
		
		patientListStart.printPatientForwards();		
		System.out.println();		
		System.out.println(patientListStart.queueLength());
		patientListStart.deletePatient("Adam");
		System.out.println(patientListStart.queueLength());
		patientListStart.deletePatient("Jane");
		System.out.println(patientListStart.queueLength());
		patientListStart = p2;
		patientListStart.deletePatient("John");
		patientListStart.printPatientForwards();
		System.out.println(patientListStart.queueLength());
		
		
		System.out.println("*****");		
		p5.printPatientBackwards();
		System.out.println("*****");
		patientListStart.deletePatient("Sam");
		patientListStart.deletePatient("Adam");
		patientListStart.printPatientForwards();
		System.out.println("*****");	
		patientListStart.printPatientBackwards();
		Patient p6 = new Patient("Dave", 54, "T.B.");
		patientListStart.addPatient(p6);
		patientListStart.deletePatient("Sam");
		patientListStart.printPatientForwards();
		System.out.println("*****");
		patientListStart.printPatientBackwards();
		
		
		
		
	}
	
	public static void main(String[] args) {
		HospitalManager hm = new HospitalManager();
		hm.launch();
	}
}
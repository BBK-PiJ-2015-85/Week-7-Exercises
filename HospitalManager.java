public class HospitalManager {
	private Patient patientListStart = null;
	
	public void launch() {
		Patient p1 = new Patient("John", 37, "Swine Flu");
		patientListStart = p1;
		patientListStart.addPatient(new Patient("Sam", 30, "Common cold"));
		patientListStart.addPatient(new Patient("Adam", 29, "Sore throat"));
		patientListStart.addPatient(new Patient("Jane", 30, "broken leg"));
		patientListStart.addPatient(new Patient("Cath", 30, "swollen knee"));
		patientListStart.printPatient();
	}
	
	public static void main(String[] args) {
		HospitalManager hm = new HospitalManager();
		hm.launch();
	}
}
public class CircularHospitalManager {
	private CircularPatient patientListStart = null;
	
	public void launch() {
		CircularPatient p1 = new CircularPatient("John", 37);
		patientListStart = p1;
		CircularPatient p2 = new CircularPatient("Sam", 30);
		patientListStart.addPatient(p2);
		CircularPatient p3 = new CircularPatient("Adam", 29);
		patientListStart.addPatient(p3);
		CircularPatient p4 = new CircularPatient("Jane", 30);
		patientListStart.addPatient(p4);
		CircularPatient p5 = new CircularPatient("Cath", 30);
		patientListStart.addPatient(p5);
		

		patientListStart.printList();
		System.out.println();
		patientListStart.deletePatient("Jane");
		System.out.println();
		patientListStart.printList();
		System.out.println();
		
		patientListStart.deletePatient("Sam");
		System.out.println();
		patientListStart.printList();
		System.out.println();
		patientListStart.deletePatient("John");
		System.out.println();
		patientListStart.printList();
		System.out.println();
		
		CircularPatient p6 = new CircularPatient("Mike", 50);
		patientListStart.addPatient(p6);
		
		patientListStart.printList();
		System.out.println();
		patientListStart.deletePatient("Jane");
		
	}
	
	public static void main(String[] args) {
		CircularHospitalManager hm = new CircularHospitalManager();
		hm.launch();
	}
}
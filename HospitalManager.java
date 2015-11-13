public class HospitalManager {
	private Patient patientListStart = null;
	
	public HospitalManager() {
		this.patientListStart = null;
	}
	
	public void addPatient(String name, int age, String illness) {
		Patient newPatient = new Patient(name, age, illness);
		if (this.patientListStart == null) {
			this.patientListStart = newPatient;
		} else {
			Patient current = patientListStart;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(newPatient);
			newPatient.setPrevious(current);
		}		
	}
	
	public void deletePatient(String name) {
		if (patientListStart.getName().equals(name)) {
			patientListStart = patientListStart.getNext();
			patientListStart.setPrevious(null);
			System.out.println("Patient " + name + " deleted.");
			return;
		} else {
			Patient current = patientListStart;
			while (current != null && !current.getName().equals(name)) {
				current = current.getNext();
			}
			if (current == null) {
				System.out.println("Patient " + name + " not found.");
				return;
			} else {
				current.getPrevious().setNext(current.getNext());
				if (current.getNext() != null) {
					current.getNext().setPrevious(current.getPrevious());
				}
				System.out.println("Patient " + name + " deleted.");
			}
		}		
	}
	
	public void printList() {
		Patient current = patientListStart;
		if (current == null) {
			System.out.println("The list is empty.");
		}
		while (current != null) {
			System.out.println("Patient: " + current.getName() + ". Age: " + current.getAge() + ". Illness: " + current.getIllness() + ".");
			current = current.getNext();
		}
	}
	
	public void printListBackwards() {
		Patient current = patientListStart;
		while (current.getNext() != null) {
			current = current.getNext(); 
		}		
		while (current != null) {
			System.out.println("Patient: " + current.getName() + ". Age: " + current.getAge() + ". Illness: " + current.getIllness() + ".");
			current = current.getPrevious();
		}
	}
	
	public int listLength() {
		int count = 0;
		Patient current = patientListStart;
		while (current != null) {
			count++;
			current = current.getNext();
		}
		return count;
	}
	
	public void launch() {
		addPatient("John", 22, "Swine Flu");
		addPatient("Sam", 30, "Common cold");
		addPatient("Adam", 29, "Sore throat");
		addPatient("Jane", 30, "broken leg");
		addPatient("Cath", 30, "swollen knee");
		
		System.out.println(listLength());
		
		printList();
		System.out.println("*****************************");
		printListBackwards();
		System.out.println("*****************************");
		deletePatient("John");
		System.out.println(listLength());
		printList();
		System.out.println("*****************************");
		printListBackwards();
		deletePatient("Sam");
		System.out.println(listLength());
		printList();	
		System.out.println("*****************************");
		printListBackwards();
		deletePatient("Adam");
		System.out.println(listLength());
		printList();
		System.out.println("*****************************");
		printListBackwards();
		deletePatient("Cath");
		System.out.println(listLength());
		printList();
		System.out.println("*****************************");
		printListBackwards();
		
		addPatient("Dave", 39, "Fever");
		addPatient("Gwen", 98, "arthritis");
		System.out.println(listLength());
		printList();
		System.out.println("*****************************");
		printListBackwards();
		
		deletePatient("Adam");
		
		
		
		
	}
	
	public static void main(String[] args) {
		HospitalManager hm = new HospitalManager();
		hm.launch();
	}
}
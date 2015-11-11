public class CircularPatient {
	private String name;
	private int age;
	private CircularPatient nextPatient;
	private boolean last;
	
	public CircularPatient(String name, int age) {
		this.name = name;
		this.age = age;
		this.nextPatient = this;
		this.last = false;
	}
	
	public void addPatient(CircularPatient newPatient) {
		
		if (this.nextPatient == this) {
			this.nextPatient = newPatient;
			newPatient.nextPatient = this;
			newPatient.last = true;
		} else {
			newPatient.nextPatient = this.nextPatient;
			this.nextPatient = newPatient;			
		}		
	}
	
	public void printList() {
		System.out.println("Patient name: " + this.name + ". Patient age: " + this.age + ".");
		if (this.last == false) {
			this.nextPatient.printList();
		}
		
	}
	
	public void deletePatient(String patientName) {
		if (this.last == true) {
			System.out.println("Patient not found.");
			return;
		} else if (this.nextPatient.name.equals(patientName)) {
			if (this.nextPatient.last == true) {
				this.last = true;
			}
			this.nextPatient = this.nextPatient.nextPatient;
			System.out.println(patientName + " has been deleted.");			
		} else {
			this.nextPatient.deletePatient(patientName);
		}
	}
}
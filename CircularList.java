public class Patient {
	private String name;
	private int age;
	private Patient nextPatient;
	private boolean last;
	
	public Patient(String name, int age) {
		this.name = name;
		this.age = age;
		this.nextPatient = this;
		this.last = true;
		//this.first = true;
	}
	
	public void addPatient(Patient newPatient) {
		if (this.nextPatient == this) {
			this.nextPatient = newPatient;
			newPatient.nextPatient = this;
			newPatient.last = true;
		} else {
			this.nextPatient = newPatient;
			newPatient.nextPatient = this.nextPatient;
		}
	}
	
	public void printList() {
		System.out.println("Patient name: " + this.name + ". Patient age: " + this.age + ".");
		if (this.last == false) {
			this.nextPatient.printList();
		}
	}
}
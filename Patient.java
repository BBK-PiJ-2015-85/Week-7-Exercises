public class Patient {
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	private Patient previousPatient;
	
	public Patient(String name, int age, String illness){
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
	}
	
	public void addPatient(Patient newPatient){
		if (this.nextPatient == null) {
			this.nextPatient = newPatient;
			newPatient.previousPatient = this;
		} else {
			this.nextPatient.addPatient(newPatient);
		}
	}
	
	public void printPatientForwards() {
		System.out.println("This patient is called: " + this.name + ". They are " + this.age + " years old. Their illness is: " + this.illness + ".");
		if(this.nextPatient != null) {
			this.nextPatient.printPatientForwards();		
		}
	}
	
	public void printPatientBackwards() {
		if (this.nextPatient != null) {
			this.nextPatient.printPatientBackwards();
		} else {
			for (Patient p = this; p != null; p = p.previousPatient) {
				System.out.println("This patient is called: " + p.name + ". They are " + p.age + " years old.");
			}
		}
	}
	
	public int queueLength() {
		/*recursive
		if (this.nextPatient == null){
			return 1;
		} else {
			return 1 + this.nextPatient.queueLength();
		}*/
		
		//iterative 
		int count = 0;
		for (Patient p = this; p != null; p = p.nextPatient) {
			count++;
		}
		return count;
	}
	
	public void deletePatient(String patientName) {
		if (this.nextPatient == null) {
			System.out.println("Patient not found.");
			return;
		} else if (this.nextPatient.name.equals(patientName)) {
			this.nextPatient = this.nextPatient.nextPatient;
			if (this.nextPatient != null) {
				this.nextPatient.previousPatient = this.nextPatient.previousPatient.previousPatient;
			}
			System.out.println(patientName + " has been deleted.");
		} else {
			this.nextPatient.deletePatient(patientName);
		}
	}
}